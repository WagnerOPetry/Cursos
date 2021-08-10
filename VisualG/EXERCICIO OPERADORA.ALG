Algoritmo "exercicio operadora"


Var

   minutos, minutosExcedentes, valor, plano : real


Inicio

    escreva("Digite a qunatidade de minutos: ")
    leia(minutos)
    
    plano <- 50.00
    valor <- plano + (2 * (minutos - 100))

    se minutos < 100 entao
       escreval("Valor a pagar: R$ ", plano:8:2)
    senao
       escreval("Valor a pagar: R$ ", valor:8:2)
    fimse
Fimalgoritmo