Algoritmo "exercicio lanchonete"


Var

   codigo, quantidade : real
   v1, v2, v3, v4, v5: real

Inicio

     escreva("Código do produto comprado: ")
     leia(codigo)
     escreva("Quantidade comprada: ")
     leia(quantidade)
     
     v1 <- 5
     v2 <- 3.5
     v3 <- 4.8
     v4 <- 8.9
     v5 <- 7.32
     
     se codigo = 1 entao
       escreva("Valor a pagar = ", v1 * quantidade:4:2)
     senao
       se codigo = 2 entao
          escreva("Valor a pagar = ", v2 * quantidade:4:2)
       senao
         se codigo = 3 entao
            escreva("Valor a pagar = ", v3 * quantidade:4:2)
         senao
           se codigo = 4 entao
              escreva("Valor a pagar = ", v4 * quantidade:4:2)
           senao
             se codigo = 5 entao
                escreva("Valor a pagar = ", v5 * quantidade:4:2)
             senao
               escreva("Produto não encontrado")
             fimse
           fimse
         fimse
       fimse
     fimse
Fimalgoritmo
fimse