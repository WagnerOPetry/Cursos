Algoritmo "exercicio validacao_de_nota"


Var

    x, y, media : real


Inicio

     escreva("Digite a primeira nota: ")
     leia(x)

     enquanto (x > 10) ou (x < 0) faca
       escreval("Nota Inválida! Tente novamente: ")
       leia(x)
     fimenquanto
     
     escreva("Digite a segunda nota: ")
     leia(y)
     
     enquanto (y > 10) ou (y < 0) faca
       escreval("Nota Inválida! Tente novamente: ")
       leia(y)
     fimenquanto

    media <- (x + y) / 2
     
     escreval("MEDIA = ", media)

Fimalgoritmo
