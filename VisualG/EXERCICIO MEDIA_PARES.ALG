Algoritmo "exercicio media_pares"


Var

   N, i, cont : inteiro
   media, soma : real
   vet : vetor [0..9] de real


Inicio

   escreva("Quantos elementos vai ter o vetor?")
   leia(N)

   para i de 0 ate N-1 faca
      escreva("Digite um numero: ")
      leia(vet[i])
   fimpara


   soma <- 0
   para i de 0 ate N-1 faca
      se vet[i] % 2 = 0 entao
         soma <- soma + vet[i]
      fimse
   fimpara

   cont <- 0
   para i de 0 ate N-1 faca
      se vet[i] % 2 = 0 entao
         cont <- cont + 1
      fimse
   fimpara
   
   se cont = 0 entao
     escreva("NENHUM NUMERO PAR")
   senao
     media <- soma / cont
     escreva("MEDIA DOS PARES = ", media:3:1)
   fimse
   
Fimalgoritmo
