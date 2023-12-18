import java.math.BigInteger

fun main() {

    try {
        println("Digite um número e eu te direi o fatorial dele:")
        val numero = readln()

        val fatorial = factorial(BigInteger.valueOf(numero.toLong()))
        println("O fatorial de $numero é $fatorial")
    } catch (e: NumberFormatException){
        println("Opa! Digite um número!")
        //main() //Fica dando linha vermelha, mas funciona pra fazer o programa rodar de novo sem ter que fazer um do while
    }
}

fun factorial(n: BigInteger): BigInteger {
    return if (n == BigInteger.ZERO)
        BigInteger.ONE
    else
        n * factorial(n - BigInteger.ONE)
}
