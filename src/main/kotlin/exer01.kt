class exer01 {

    companion object {
        fun main() {
            println("Exercício 01:")
            println("Escreva várias strings (separadas por vírgula):")
            val entradaDoUsuario = readln()

            val listaDeStrings = entradaDoUsuario?.split(",")?.map { it.trim() } ?: emptyList()
            val qtdDeStringsComA = contarStringsComecandoComA(listaDeStrings)

            println("Quantidade de strings que começam com A (sem acento): $qtdDeStringsComA")
        }

        fun contarStringsComecandoComA(lista: List<String>): Int {
            val stringsComA = lista.filter { it.startsWith("A", ignoreCase = true) }
            return stringsComA.size
        }
    }

}