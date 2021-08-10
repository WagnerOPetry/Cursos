Algoritmo "exercicio soma_vetores"


Var

   N, i : inteiro
   vetA : vetor [0..9] de real
   vetB : vetor [0..9] de real
   vetC : vetor [0..9] de real


Inicio

   escreva("Quantos valores vai ter cada vetor?")
   leia(N)

   escreval("Digite os valores do vetor A: ")
   para i de 0 ate N-1 faca
      leia(vetA[i])
   fimpara

   escreval("Digite os valores do vetor B: ")
   para i de 0 ate N-1 faca
      leia(vetB[i])
   fimpara

   para i de 0 ate N-1 faca
      vetC[i] <- vetA[i] + vetB[i]
   fimpara

   escreval
   escreval("VETOR RESULTANTE: ")

   para i de 0 ate N-1 faca
      escreval(vetC[i])
   fimpara

FimAlgoritmo