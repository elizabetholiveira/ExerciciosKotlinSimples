class exer05(): exer {

        override fun main() {
            println("Exercício 05:")
            println("Vou gerar uma sequência de fibonacci. Por favor, quantos números você quer nessa lista?")
            val entradaDoUsuario = readln()

            println("Sequência:")
            for (i in 0 until entradaDoUsuario.toInt()) {
                val fibonacciNumber = fibonacci(i)
                print("$fibonacciNumber")
                if (i < entradaDoUsuario.toInt().minus(1)) {
                    print(" - ")
                }
            }

        }

        fun fibonacci(n: Int): Int {
            return if (n <= 1) {
                n
            } else {
                fibonacci(n - 1) + fibonacci(n - 2)
            }
        }

}