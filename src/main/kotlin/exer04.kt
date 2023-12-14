class exer04(): exer {

    override fun main() {
        println("Exercício 04:")
        println("Escreva uma frase:")
        val entradaDoUsuario = readln()

        val vowelCount = countVowels(entradaDoUsuario)
        println("Sua frase contém: $vowelCount vogais!")
    }

    fun countVowels(sentence: String): Int {
        val vowels = "aeiouAEIOUáàãõéóôü"
        return sentence.count { it in vowels }
    }

}