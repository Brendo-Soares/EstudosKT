package TiposDeDados
fun main() {
    println("Questão 1 - Fácil:")
    val idade = 18
    val nome = "Brendo"
    println("Meu nome é $nome e tenho $idade anos")

    println("Questão 2 - Médio")
    val precoProduto = 5.10
    val quantidade = 5
    val valorTotal = precoProduto * quantidade
    println(valorTotal)

    println("Questão 3 - Difícil")
    val name = "Glenda"
    val age = 19
    val altura = 1.75
    val estudante = false
    println("""
        Nome: $name
        Idade: $age
        Idadade em double: ${age.toDouble()}
        Altura: $altura
        Estudante: $estudante
    """.trimIndent())
}