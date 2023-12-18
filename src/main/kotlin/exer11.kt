fun main(){

    println("Aviso: Esse programa só conjuga verbos regulares (e alguns verbos -ir tipo sorrir - sorrio)!")

    //Digitar um verbo terminando em AR, ER ou IR
    println("Escreva um verbo regular terminado em -ar, -er ou -ir")
    var verbo = readln()

    //Identificar se o verbo termina em AR, ER ou IR
    //Conjugar em Eu, Você (que abarca Ele/Ela também, já que é a mesma conjugação), Nós, Vocês
    //Vou deixar sem o Tu porque a lógica é a mesma dos anteriores, então prefiro focar na linguagem falada(informal)
    if (irregulares().contains(verbo)) {
        println("Opa! Eu não posso conjugar esse verbo!")
    } else if (verbo.endsWith("ar", true) && verbo.length > 2){
        println("Eu " + raiz(verbo) + "o")
        println("Você " + raiz(verbo) + "a")
        println("Nós " + raiz(verbo) + "amos")
        println("Vocês " + raiz(verbo) + "am")
    } else if (verbo.endsWith("er", true) && verbo.length > 2) {
        println("Eu " + raiz(verbo) + "o")
        println("Você " + raiz(verbo) + "e")
        println("Nós " + raiz(verbo) + "emos")
        println("Vocês " + raiz(verbo) + "em")
    } else if (irEspecial().contains(verbo)) {
        println("Eu " + raiz(verbo) + "io")
        println("Você " + raiz(verbo) + "i")
        println("Nós " + raiz(verbo) + "imos")
        println("Vocês " + raiz(verbo) + "iem")
    } else if (verbo.endsWith("ir", true) && verbo.length > 2) {
        println("Eu " + raiz(verbo) + "o")
        println("Você " + raiz(verbo) + "e")
        println("Nós " + raiz(verbo) + "imos")
        println("Vocês " + raiz(verbo) + "em")
    } else {
        println("Opa! Essa palavra não parece ser um verbo válido!")
    }

}

fun raiz(verbo: String): String {
    return verbo.dropLast(2).lowercase()
}

fun irregulares(): Array<String> {
    return arrayOf(
        "ver",
        "dormir",
        "ir",
    )
}

fun irEspecial(): Array<String> {
    return arrayOf(
        "sorrir",
        "rir"
    )
}
