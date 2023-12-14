import java.lang.Exception
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.time.temporal.ChronoUnit

class exer02(): exer {

    override fun main() {
        println("Exercício 02:")

        var pronto = false

        do {
            println("Digite a sua data de nascimento (DD/MM/AAAA) e eu te direi sua idade atual!")
            val entradaDoUsuario = readln()
            try {
                if (entradaDoUsuario != null && isValidDate(entradaDoUsuario)) {
                    //Converte a entrada do usuário para um objeto de data
                    val dataDigitada =
                        LocalDate.parse(entradaDoUsuario, DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                    //Obtém a data atual
                    val dataAtual = LocalDate.now()

                    if (isAniversarioHoje(dataDigitada)) {
                        print("Parabéns! Hoje é o seu aniversário! ")
                    }

                    //Calcula a diferença em anos (idade)
                    val idade = ChronoUnit.YEARS.between(dataDigitada, dataAtual)

                    println("Você tem $idade anos!")
                    pronto = true

                } else {
                    println("Data inserida inválida")
                }
            } catch (ex: DateTimeParseException) {
                println("Sinto muito, não é possível ler essa data")
            }
        } while (!pronto)
    }

    fun isValidDate(date: String): Boolean {
        return try {
            val dateFormat = SimpleDateFormat("dd/MM/yyyy")
            dateFormat.isLenient = false
            dateFormat.parse(date)
            true
        } catch (e: Exception) {
            false
        }
    }

    fun isAniversarioHoje(dataNascimento: LocalDate): Boolean {
        val hoje = LocalDate.now()

        return hoje.dayOfMonth == dataNascimento.dayOfMonth && hoje.month == dataNascimento.month
    }

}