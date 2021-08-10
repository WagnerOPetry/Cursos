Algoritmo "exercicio temperatura"


Var

    escala, celsius, fahreinheit: caractere
    temperatura, C, F : real


Inicio

   escreva("Voce vai digitar a temperatura em qual escala (C/F)? ")
   leia(escala)
   


   se (escala = "C") entao
      escreva("Digite a temperatura em Celsius: ")
      leia(C)
      F <- C * (9 / 5) + 32
      escreval("Temperatura equivale em Fahrenheit: ", F:4:2)
      
   senao
      escreva("Digite a temperatura em Fahrenheit: ")
      leia(F)
      C <- (5 / 9) * (F - 32)
      escreval("Temperatura equivale em Celsius: ", C:4:2)
      
   fimse
   

   


     
Fimalgoritmo