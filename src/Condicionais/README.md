Podemos executar diferentes ações através das condicionais em Kotlin. Temos if, else if e else como as mais conhecidas e que funcionam da mesma maneiras como em qualquer outra linguagem:
Sintaxe:

```kotlin
fun main() {
    if (condicao = true) {
        //Executa esse bloco de código
    }
    else if (condicao = false) {
        //executa esse bloco
    } else {
        //executa esse bloco
    }
}
```

Exemplo:

```kotlin
fun main() {
    val num1 = 6
    val num2 = 5
    val num3 = 1
    val media = (num1 + num2 + num3)/3
    println(media)
    //Descobrindo a media
    if (media >= 7) {
        println("Aprovado")
    } else if (media >= 5 && media <= 6){
        println("Recuperação")
    } else {
        println("Reprovado")
    }
}
```

O código `when` compara o valor de uma variável com varios casos e exibe o resultado de acordo com o valor estabelecido, por exemplo:

```kotlin
fun main(){
    val idade = 18
    when(idade) {
        in 0..12 -> println("Criança")
        in 13..17 -> println("Adolescente")
        in 18..59 -> println("Adulto")
        else -> println("Idoso")
    }
} //a saída exibirá "Adulto"
```

### 🟢 Questão Fácil – `if` e `else`

Crie um programa em Kotlin que:

- Declare uma variável `idade` do tipo `Int`
- Use uma estrutura `if/else` para verificar:
- Se a idade é maior ou igual a 18, imprima `"Maior de idade"`
- Caso contrário, imprima `"Menor de idade"`

---

### 🟡 Questão Média – `if`, `else if`

Crie um código em Kotlin que:

- Declare uma variável `nota` do tipo `Double`
- Use `if`, `else if` e `else` para classificar a nota:
- Nota maior ou igual a 9 → `"Excelente"`
- Nota maior ou igual a 7 → `"Bom"`
- Nota maior ou igual a 5 → `"Regular"`
- Abaixo de 5 → `"Insuficiente"`
- Imprima a classificação no console

---

### 🔴 Questão Difícil – `when`

Crie um programa em Kotlin que:

- Declare uma variável `diaSemana` do tipo `Int` (valores de 1 a 7)
- Use a estrutura `when` para:
- 1 → `"Domingo"`
- 2 → `"Segunda-feira"`
- 3 → `"Terça-feira"`
- 4 → `"Quarta-feira"`
- 5 → `"Quinta-feira"`
- 6 → `"Sexta-feira"`
- 7 → `"Sábado"`
- Qualquer outro valor → `"Dia inválido"`
- Imprima o resultado no console