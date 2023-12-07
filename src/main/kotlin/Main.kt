import kotlin.NumberFormatException

//Tentando fazer os 5 primeiros exercícios rodarem aqui como se fosse um menu de seleção
fun main(args: Array<String>) {
    println("Hello World!")
    var entradaCorreta = false

    do {
        println("Selecione qual exercício deseja ver:")

        var i = 1

        //TODO Ajeitar que isso tá fazendo a lista de exercícios rodar todinha
        //val (listaExercicios, qtdExer1) = exer()
        val qtdExer = 5

        while (i <= qtdExer) {
            println("$i ) Exercício $i")
            i++
        }

        val input = readln()

        try {
            val entradaDoUsuario: Int = input.toInt() ?: throw NumberFormatException("Entrada inválida")

            entradaCorreta = true
            if (entradaDoUsuario <= qtdExer) {
                when (entradaDoUsuario) {
                    //entradaDoUsuario -> listaExercicios[entradaDoUsuario - 1]
                    1 -> exer01.main()
                    2 -> exer02.main()
                    3 -> println("3")
                    4 -> println("4")
                    5 -> println("5")
                }
            }
                else {
                    println("Número inválido")
                    entradaCorreta = false
                }
        } catch (e: NumberFormatException) {
            println("Entrada inválida. Por favor, digite apenas o número")
        }
    } while (!entradaCorreta)

}

fun exer(): Pair<List<Unit>, Int> {
    var exercicios = listOf(
        exer01.main()
    )

    return exercicios to exercicios.size
}