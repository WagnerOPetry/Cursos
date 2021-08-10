Algoritmo "exercicio troco verificado"


Var

    preco, quantidade, dinheiro, troco, diferenca : real


Inicio

  escreva("Preço unitário do produto: ")
  leia(preco)
  escreva("Quantidade comprada: ")
  leia(quantidade)
  escreva("Dinheiro recebido: ")
  leia(dinheiro)
  
  troco <- dinheiro - (preco * quantidade)
  diferenca <- (preco * quantidade) - dinheiro
  
  se dinheiro < (preco * quantidade) entao
     escreva("DINHEIRO INSUFICIENTE. FALTAM ", diferenca:4:2, " reais.")
  senao
     escreva("TROCO = ", troco:4:2)
  fimse
     
Fimalgoritmo