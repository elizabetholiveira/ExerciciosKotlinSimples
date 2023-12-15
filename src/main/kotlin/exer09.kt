import java.util.InputMismatchException

fun main() {

    var again = true

    do {
        try {
            println("Escreva uma lista de números(separados por vírgula) e eu retornarei a média:")
            val entradaDoUsuario = readln()
            val listaDeNumeros = entradaDoUsuario.split(",").map {it.toDouble()}

            again = false

            println("A média dos números digitados é:")
            println(media(listaDeNumeros))
        } catch (e: NumberFormatException) {
            println("Por favor, digite apenas números separados por vírgula (em caso de números decimais, use o ponto)")
        }
    } while (again)

}

fun media(lista: List<Double>): Double {
   val soma = lista.sum()

    return soma / lista.size.toDouble()
}