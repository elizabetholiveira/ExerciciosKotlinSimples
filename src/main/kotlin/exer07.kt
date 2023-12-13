fun main() {
    println("Escreva uma lista de palavras(separadas por vírgula) que eu te retornarei-a invertida!")
    val entradaDoUsuario = readln()

    val listaInicial = entradaDoUsuario?.split(",")?.map { it.trim() } ?: emptyList()

    println("Sua lista:")
    println(listaInicial)
    println("Lista invertida:")
    println(listaInvertida(listaInicial))
    println("Lista com as letras das palavras invertidas")
    println(reverseWordList(listaInicial))
    println("Lista invertida com as letras das palavras invertidas")
    println(reverseWordList(listaInvertida(listaInicial)))
}

fun listaInvertida(lista: List<String>): List<String> {
    return lista.asReversed()
}

//Sugestão da IA do StackSpot, achei interessante deixar pra ver a diferença
fun reverseWordList(words: List<String>): List<String> {
    return words.map { it.reversed() }
}
