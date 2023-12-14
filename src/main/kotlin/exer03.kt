class exer03(): exer {

    override fun main() {
        println("Exercício 03:")
        println("Digite uma lista de números separados por vírgula:")
        val entradaDoUsuario = readln()

        val numeros = entradaDoUsuario?.split(',')?.mapNotNull { it.trim().toDoubleOrNull() } ?: emptyList()

        val maiorNumero = encontrarMaiorNumero(numeros)

        if (maiorNumero != null) {
            println("O maior número da lista é: $maiorNumero")
        } else {
            println("A lista está vazia ou não contém números válidos")
        }

    }

    fun encontrarMaiorNumero(lista: List<Double>): Double? {
        if (lista.isEmpty()) {
            return null
        }

        var maior = lista[0]

        for (numero in lista) {
            if (numero > maior) {
                maior = numero
            }
        }

        return maior

    }

}