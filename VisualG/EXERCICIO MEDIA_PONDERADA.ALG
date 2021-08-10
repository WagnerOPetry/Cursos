Algoritmo "exercicio media_ponderada"


Var

    N, i : inteiro
    media, X1, X2, X3 : real


Inicio

   escreva("Quantos casos voce vai digitar? ")
   leia(N)
   
   para i de 1 ate N faca
   
     escreval("Digite tres numeros: ")
     leia(X1)
     leia(X2)
     leia(X3)
     
     media <- (X1 * 2 + X2 * 3 + X3 * 5) / 10
     
     escreval("MEDIA = ", media:3:1)

   fimpara

Fimalgoritmo