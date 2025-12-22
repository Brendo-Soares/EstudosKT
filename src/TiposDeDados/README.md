- Tipos inteiros são ****números que não possuem qualquer parte decimal:
    - byte - o byte pode armazenar números inteiros de -128 a 127. Pode ser usado para economizar memória quando tiver certeza que o valor estará entre -127 e 128
    - Short - o short pode armazenar inteiros de -32768 e 32767
    - Int - Pode armazenar de -2147483648 a 2147483648
    - Long - Só é utilizado quando o Int não for suficiente para armazenar o valor
- Tipos flutuantes apresentam numeros com um decimal, como 9,99 ou 3,14. `float` e `double` são números com casas decimais. A diferença é que float ocupa menos memória e é necessário colocar um “F” ao final de cada numero:

    ```kotlin
    val pi = 3.14F
    ```

  É mais seguro usar double para a maioria dos cálculos

- Tipos Booleans apresentam um tipo de dados que podem ter dois valores:
    - Sim e Não
    - On e Off
    - 0 e 1
    - True ou False
- Tipo Char é usado para armazenar um único caractere. Ele deve estar entre aspas simples
- String é uma sequencia de caracteres escritas entre aspas duplas “Hello World”
    - Podemos acessar um caractere da String com o número do índice entre colchetes [1], por exemplo:

    ```kotlin
    fun main() {
        val txt = "hello World"
    
        println(txt[4])
    }
    //A saída será "o"
    ```

    - Uma string, como outros objetos em kotlin, contém propriedades e funções que nos permitem realizar operações.
        - Podemos usar a propriedade length para exibir o comprimento da string, por exemplo:

        ```kotlin
        fun main() {
            val txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        
            println("O alfabeto tem ${txt.length} letras")
        }
        //A saída vai exibir "O alfabeto tem 26 letras"
        ```

        - Podemos deixar a string em maiúsculo e em minúsculo utilizando as propriedades toUpperCase() e toLowerCase() respectivamente, por exemplo:

        ```kotlin
        fun main() {
            val txt = "esse texto ficará em maiúsculo"
            val txt2 = "ESSE TEXTO FICARÁ EM MINÚSCULO"
        
            println(txt.uppercase())
            println(txt2.lowercase())
        }
        //A saída vai exibir "ESSE TEXTO FICARÁ EM MAIÚSCULO"
        //A segunda saída vai exibir "esse texto ficará em minúsculo"
        ```

        - Podemos comparar duas strings utilizando compareTo(). Caso sejam iguais, a saida retorna **0**, caso sejam diferentes retorna **-1**

        ```kotlin
        fun main() {
            val txt = "esse é o texto 1"
            val txt2 = "esse é o texto 2"
        
            println(txt.compareTo(txt2))
        }
        //A saída vai exibir -1 pois os dois textos são diferentes
        ```

        - Podemos concatenar duas strings utilizando o “+”, por exmplo:

            ```kotlin
            fun main() {
                val nome = "Brendo"
                val sobrenome = "Soares"
            
                println(nome + " " + sobrenome)
            }
            //A saída vai Brendo Soares
            ```

          Porem, para reduzir a quantidade de códigos, podemos apenas utilizar uma expressão modelo representada pelo símbolo de cifrão $

            ```kotlin
            fun main() {
                val nome = "Brendo"
                val sobrenome = "Soares"
            
                println("Meu nome é $nome $sobrenome")
            }
            //A saída ainda vai ser Brendo Soares sem precisar especificar um espaço como nos anteriores
            ```

- Podemos converter os valores de um tipo de dado para outro utilizando diversas funções como mostra a tabela abaixo
    - **`toByte()`**
    - **`toShort()`**
    - **`toInt()`**
    - **`toLong()`**
    - **`toFloat()`**
    - **`toDouble()`**
    - **`toChar()`**

  Se quiser transformar qualquer dado em uma string, podemos usar a função **`toString()`**

### 🟢 Questão Fácil – Variáveis e Tipos de Dados

Crie um código em Kotlin que:

- Declare uma variável do tipo `Int` chamada `idade` e atribua a ela o valor `18`
- Declare uma variável do tipo `String` chamada `nome` e atribua seu nome
- Imprima no console uma frase no seguinte formato:

    ```bash
    Meu nome é <nome> e tenho<idade> anos.
    ```


---

### 🟡 Questão Média – Variáveis e Tipos de Dados

Crie um programa em Kotlin que:

- Declare três variáveis:
    - `precoProduto` do tipo `Double`
    - `quantidade` do tipo `Int`
    - `valorTotal` do tipo `Double`
- Calcule o valor total multiplicando o preço pela quantidade
- Imprima o resultado no console com duas casas decimais, por exemplo:

    ```bash
    Valor total da compra:R$25.50
    ```


---

### 🔴 Questão Difícil – Variáveis e Tipos de Dados

Crie um código em Kotlin que:

- Declare variáveis para armazenar:
    - Um nome (`String`)
    - Uma idade (`Int`)
    - Uma altura (`Double`)
    - Um valor que indique se a pessoa é estudante (`Boolean`)
- Utilize **interpolação de strings** para imprimir todas as informações em uma única frase
- Converta a idade para `Double` e mostre esse valor junto na impressão

Exemplo de saída (os valores podem ser diferentes):

```bash
Nome:Ana,Idade:20,Idade em Double:20.0,Altura:1.65,Estudante:true
```