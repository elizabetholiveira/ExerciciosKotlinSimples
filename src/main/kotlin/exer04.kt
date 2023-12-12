class exer04 {

    companion object {

        fun main() {
            println("Escreva uma frase:")
            val entradaDoUsuario = readln()

            val vowelCount = countVowels(entradaDoUsuario)
            println("Sua frase contém: $vowelCount vogais!")
        }

        fun countVowels(sentence: String): Int {
            val vowels = "aeiouAEIOUáàãõéóôü"
            return sentence.count {it in vowels}
        }

    }

}