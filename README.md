# Seleção de Números Primos

Este é um projeto simples em Java criado como parte dos meus estudos sobre a linguagem e algoritmos.

## Descrição

O programa `NumerosPrimos.java` contém um método `main` que itera pelos números de 2 a 100 e verifica, um por um, se o número é primo.

Se um número for primo, ele é impresso no console.

## Como Funciona

O algoritmo utiliza a seguinte lógica:
1.  Começa a verificar a partir do número 2.
2.  Para cada número `i` (de 2 a 100):
    * Assume-se que `i` é primo (`numeroPrimo = true`).
    * Tenta-se dividir `i` por todos os números (`divisor`) de 2 até a metade de `i` (`i / 2`).
    * Se `i` for divisível por qualquer `divisor` (ou seja, `i % divisor == 0`), o número não é primo (`numeroPrimo = false`) e a verificação para.
3.  Se, ao final da verificação, `numeroPrimo` ainda for `true`, o número `i` é impresso.

## Como Executar

Se você tiver o Java Development Kit (JDK) instalado:

1.  Clone este repositório:
    ```bash
    git clone [https://github.com/ItalloOliveira01/selecao-numeros-primos.git](https://github.com/ItalloOliveira01/selecao-numeros-primos.git)
    ```
2.  Navegue até a pasta:
    ```bash
    cd selecao-numeros-primos
    ```
3.  Compile o arquivo Java:
    ```bash
    javac NumerosPrimos.java
    ```
4.  Execute o programa:
    ```bash
    java NumerosPrimos
    ```

A saída será a lista de números primos de 2 a 100:
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.


## 👨‍💻 Autor

**Ítallo Gabriel de Oliveira Correia**

  * *Estudante de Análise e Desenvolvimento de Sistemas*
  * *Focado em Java, lógica de programação e desenvolvimento de software limpo.*
