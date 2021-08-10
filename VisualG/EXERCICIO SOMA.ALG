Algoritmo "Exercicio troco"

Var

   preco, quantidade, dinheiro, troco : real

Inicio

   escreva("Preço unitário do produto: ")
   leia(preco)
   escreva("Quantidade comprada: ")
   leia(quantidade)
   escreva("Dinheiro recebido: ")
   leia(dinheiro)
   
   troco <- dinheiro - (preco * quantidade)
   
   escreval("TROCO = ", troco:8:2)

Fimalgoritmo