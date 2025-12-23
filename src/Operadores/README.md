- Operadores aritméticos:
    - São os operadores utilizados para as operações matemáticas

```kotlin
fun main() {
    var num1 = 100

    println(num1 + 100) //A saída será 200
    println(num1 - 50)  //A saída será 50
    println(num1 * 100) //A saída será 10000
    println(num1 / 100) //A saída será 1
    println(num1 % 6) //A saída será 4
    println(++num1) //A saída será 101
    println(--num1) //A saída retornará 100
}
```

- Operadores de comparação:

  Eles comparam os valores entre duas variáveis

  | Operador | Nome | Exemplo |
      | --- | --- | --- |
  | == | Igual a | x == y |
  | != |  Diferente de | x != y |
  | > | Maior que | x  > y |
  | < | menor que | x < y |
  | >= | Maior ou igual a | x >= y |
  | <= | Menor ou igual a | x <= y |



### 🟢 Questão Fácil – Operadores Aritméticos

Crie um programa em Kotlin que:

- Declare duas variáveis inteiras `a` e `b`
- Realize as seguintes operações usando **operadores aritméticos**:
    - soma (`+`)
    - subtração ()
    - multiplicação ()
    - divisão (`/`)
- Imprima o resultado de cada operação no console

---

### 🟡 Questão Média – Operadores Relacionais e Lógicos

Crie um código em Kotlin que:

- Declare duas variáveis inteiras `nota1` e `nota2`
- Calcule a média das notas
- Use **operadores relacionais e lógicos** para verificar:
    - Se a média é maior ou igual a 6 **e**
    - Se ambas as notas são maiores que 4
- Imprima `true` ou `false` indicando se o aluno foi aprovado com base nessas condições

---

### 🔴 Questão Difícil – Operadores de Atribuição e Lógicos

Crie um programa em Kotlin que:

- Declare uma variável `saldo` do tipo `Double` com valor inicial `1000.0`
- Use **operadores de atribuição composta** (`+=`, `=`)
    - Adicione `500.0` ao saldo
    - Subtraia `200.0` do saldo
- Use **operadores lógicos** para verificar se:
    - O saldo final é maior que `1000.0` **ou**
    - O saldo final é igual a `0.0`
- Imprima o saldo final e o resultado da verificação lógica