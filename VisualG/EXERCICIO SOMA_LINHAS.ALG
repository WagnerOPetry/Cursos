Algoritmo "exercicio soma_linhas"


Var

   N, M, i, j : inteiro
   mat : vetor [0..9, 0..9] de real
   vet : vetor [0..9] de real


Inicio

   escreva("Qual a quantidade de linhas na matriz? ")
   leia(M)
   escreva("Qual a quantidade de colunas da matriz? ")
   leia(N)
   

   para i de 0 ate M-1 faca
   escreval("Digite os elementos da ", i+1, "a. linha:")
     para j de 0 ate N-1 faca
       leia(mat[i, j])
     fimpara
   fimpara
   
   vet[i] <- 0
   para i de 0 ate M-1 faca
     para j de 0 ate N-1 faca
      vet[i] <- vet[i] + mat[i, j]
     fimpara
   fimpara
   
   escreval("VETOR GERADO:")
      para i de 0 ate M-1 faca
      escreva(vet[i]:3:1)
      escreval
   fimpara

     
Fimalgoritmo