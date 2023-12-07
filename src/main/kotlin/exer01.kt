class exer01 {

    companion object {
        fun main() {
            println("Exercício 01:")

            val listaDeStrings = listOf("Abacaxi", "Banana", "Maçã", "abacate")
            val qtdDeStringsComA = contarStringsComecandoComA(listaDeStrings)

            println("Quantidade de strings que começam com A: $qtdDeStringsComA")
        }

        fun contarStringsComecandoComA(lista: List<String>): Int {
            val stringsComA = lista.filter { it.startsWith("A", ignoreCase = true) }
            return stringsComA.size
        }
    }

}