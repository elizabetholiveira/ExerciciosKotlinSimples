import kotlin.NumberFormatException

//Fazendo os 5 primeiros exercícios rodarem aqui como se fosse um menu de seleção
fun main(args: Array<String>) {
    println("Hello World!")
    var entradaCorreta = false

    do {
        println("Selecione qual exercício deseja ver:")

        var i = 1

        val listaExercicios = exer()
        val qtdExer = listaExercicios.size

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
                    entradaDoUsuario -> listaExercicios[entradaDoUsuario - 1].main()

                }
            } else {
                println("Número inválido")
                entradaCorreta = false
            }
        } catch (e: NumberFormatException) {
            println("Entrada inválida. Por favor, digite apenas o número")
        }
    } while (!entradaCorreta)

}

fun exer(): List<exer> {
    var exercicios: List<exer> = listOf(
        exer01(),
        exer02(),
        exer03(),
        exer04(),
        exer05()
    )

    return exercicios
}
