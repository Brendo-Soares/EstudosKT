package Operadores
fun main() {
    println("Questão 1 - Fácil")
    val a = 500
    val b = 400

    println("""
        Soma(+): ${a + b}
        Subtração(-): ${a - b}
        Multiplicação(*): ${a * b}
        Divisão(/): ${a / b}
    """.trimIndent())
    println("Questão 2 - Médio")

    val nota1 = 6
    val nota2 = 8
    val media = (nota1 + nota2) / 2
    if (media >= 6 && nota1 > 4 && nota2 > 4){
        println("True")
    } else {
        println("False")
    }

    println("Questão 3 - Difícil")
    var saldo = 1000.0
    saldo += 500.0
    println("R$500 foram adicionados ao saldo")
    saldo -= 200.0
    println("R$200 foram retirados do saldo")
    if (saldo >= 1000.0){
        println("O saldo final é de: R$$saldo")
    } else {
        println("O saldo é 0")
    }
}