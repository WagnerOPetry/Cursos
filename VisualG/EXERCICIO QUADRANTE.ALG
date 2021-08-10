Algoritmo "exercicio quadrante"


Var

    X, Y : inteiro


Inicio

     escreva("Digite os valores das coordenadas X e Y: ")
     leia(X)
     leia(Y)
     

     enquanto (X <> 0) e (Y <> 0) faca

     se (X > 0) e (Y > 0) entao
       escreval("QUADRANTE 1")
     senao
       se (X > 0) e (Y < 0) entao
         escreval("QUADRANTE 4")
       senao
         se (X < 0) e (Y > 0) entao
           escreval("QUADRANTE 2")
         senao
           escreval("QUADRANTE 3")

         fimse
       fimse
     fimse
     
       leia(X)
       leia(Y)
       
     fimenquanto
Fimalgoritmo