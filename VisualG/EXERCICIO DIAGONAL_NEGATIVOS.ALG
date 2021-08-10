Algoritmo "exercicio diagonal_negativos"


Var

   N, i, j : inteiro
   mat : vetor [0..9, 0..9] de inteiro
   cont : inteiro

Inicio

   escreva("Qual a ordem da matriz? ")
   leia(N)
   
   para i de 0 ate N-1 faca
     para j de 0 ate N-1 faca
       escreva("Elemento de [",i, ",",j, "]: ")
       leia(mat[i, j])
     fimpara
   fimpara
   
   cont <- 0
   para i de 0 ate N-1 faca
     para j de 0 ate N-1 faca
        se mat[i, j] < 0 entao
          cont <- cont + 1
        fimse
     fimpara
   fimpara
   
   escreval("DIAGONAL PRINCIPAL:")
   para i de 0 ate N-1 faca
     escreva(mat[i, i], " ")
   fimpara
   escreval
   
   escreva("QUANTIDADE DE NEGATIVOS = ", cont)
Fimalgoritmo