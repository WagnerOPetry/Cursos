Algoritmo "exercicio numeros_pares"


Var

    N, i, quant : inteiro
    vet : vetor [0..9] de real
    


Inicio

     escreva("Quantos numeros voce vai digitar?")
     leia(N)
     
        para i de 0 ate N-1 faca
          escreva("Digite um numero: ")
          leia(vet[i])
        fimpara
     
     escreval("NUMEROS PARES: ")
        para i de 0 ate N-1 faca
          se vet[i] % 2 = 0 entao
             escreva(vet[i], "  ")
          fimse
        fimpara
     
     quant <- 0
        para i de 0 ate N-1 faca
           se vet[i] % 2 = 0 entao
             quant <- quant + 1
           fimse
        fimpara
     
     escreval
     escreva("QUANTIDADE DE PARES = ", quant)
          
     
Fimalgoritmo