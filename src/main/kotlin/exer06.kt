import kotlin.random.Random

var pontoEsc = 0
var pontoComp = 0

var turnos: Int = 0

fun main(args: Array<String>) {

    println("Vamos jogar pedra, papel e tesoura?")

    var pronto = false

    do {
        try {
            println("Diga quantos turnos você quer!")
            turnos = readln().toInt()

            var i = 1
            do {
                jogo()
                i++
            } while (i <= turnos)

            println()

            pontuacao()

            if (pontoEsc == pontoComp) {
                do {
                    println("Vocês empataram! Que estranho... Quer desempate? (Y/N)")

                    val desempate = readln()
                    if (desempate.equals("Y", true)) {
                        do {
                            jogo()
                        } while (pontoEsc == pontoComp)
                        pontuacao()
                        pronto = true
                    } else if (desempate.equals("N", true)) {
                        pronto = true
                    } else {
                        println("Ops! Você precisa digitar 'Y' ou 'N'!")
                    }
                } while (!pronto)
            }

            if (pontoEsc > pontoComp) {
                println("Você venceu! Parabéns!")
                pronto = true
            } else {
                println("Mais sorte da próxima vez!")
                pronto = true
            }

        } catch (e: NumberFormatException) {
            println("Opa! Você tem que digitar um número")
        }
    } while (!pronto)

}

fun nomeGolpe(selecao: Int): String {
    if (selecao == 1) {
        return "pedra 🪨"
    } else if (selecao == 2) {
        return "papel 📃"
    }
        return "tesoura ✂️"
}

fun jogo() {
    try {

        println("Selecione um!")
        println("1) Pedra")
        println("2) Papel")
        println("3) Tesoura")
        val escolha = readln().toInt()
        val nomeEsc = nomeGolpe(escolha)

        val computador = Random.nextInt(1, 4)
        val nomeComp = nomeGolpe(computador)

        if (escolha in 1..3) {
            println("Você jogou $nomeEsc")
            println("Rival jogou $nomeComp")

            if (escolha == computador) {
                println("Empate!")
            } else if (escolha == 3 && computador == 1 || escolha == 1 && computador == 3) {
                if (escolha > computador) {
                    println("Rival ganhou!")
                    pontoComp++
                } else {
                    println("Você ganhou!")
                    pontoEsc++
                }
            } else {
                if (escolha > computador) {
                    println("Você ganhou!")
                    pontoEsc++
                } else {
                    println("Rival ganhou!")
                    pontoComp++
                }

            }
        } else {
            turnos++
            throw NumberFormatException()
        }
    } catch (e: NumberFormatException) {
        println("Opa! Você tem que digitar um número válido!")

    }
}

fun pontuacao() {
    println("Pontuação final:")
    println("Você: $pontoEsc")
    println("Rival: $pontoComp")
}