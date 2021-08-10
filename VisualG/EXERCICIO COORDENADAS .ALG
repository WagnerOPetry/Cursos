Algoritmo "exercicio coordenadas "


Var

   X, Y : real
   quadrante: caractere


Inicio

    escreva("Valor de X: ")
    leia(X)
    escreva("Valor de Y: ")
    leia(Y)
    
    se (X > 0) e (Y > 0) entao
       escreval("Q1")
       
    senao
      se (X < 0) e (Y > 0) entao
         escreval("Q2")
         
      senao
        se (X < 0) e (Y < 0) entao
           escreval("Q3")
        senao
          se (X = 0) e (Y = 0) entao
              escreval("Ponto Origem")
          senao
              se (X > 0) e (Y < 0) entao
                 escreval("Q4")
              senao
                 se X = 0 entao
                    escreval("Eixo Y")
                 senao
                   escreval("Eixo X")

                 fimse
              fimse
          fimse
        fimse
      fimse
    fimse
    
    
     
Fimalgoritmo
