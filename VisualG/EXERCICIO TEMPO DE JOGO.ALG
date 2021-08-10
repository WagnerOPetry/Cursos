Algoritmo "exercicio tempo de jogo"


Var

   horaInicial : inteiro
   horaFinal : inteiro
   duracao : inteiro
   



Inicio

   escreva("Hora inicial: ")
   leia(horaInicial)
   escreva("Hora Final: ")
   leia(horaFinal)
   
   se horaInicial >= horaFinal entao
      duracao <- 24 - horaInicial + horaFinal
   senao
      duracao <- horaFinal - horaInicial
   
   fimse
   
   escreval("O JOGOS DUROU", duracao, " HORA(S)")
     
Fimalgoritmo