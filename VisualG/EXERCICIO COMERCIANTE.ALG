Algoritmo "exercicio comerciante"


Var

   N, i : inteiro
   produtos : vetor [0..9] de caractere
   precoC : vetor [0..9] de real
   precoV: vetor [0..9] de real
   somaC, somaV, lucro, A, B, C : real


Inicio

    escreva("Serao digitados dados de quantos produtos? ")
    leia(N)
    
    para i de 0 ate N-1 faca
      escreval("Produto ", i+1, ": ")
      escreva("NOME: ")
      leia(produtos[i])
      escreva("Preco de compra: ")
      leia(precoC[i])
      escreva("Preco de Venda: ")
      leia(precoV[i])
    fimpara
    
    somaC <- 0
    somaV <- 0
    para i de 0 ate N-1 faca
      somaC <- somaC + precoC[i]
      somaV <- somaV + precoV[i]
    fimpara
    
    lucro <- somaV - somaC
    
    A <- 0
    B <- 0
    C <- 0
    para i de 0 ate N-1 faca
      se ((precoV[i] * 100) / precoC[i]) - 100 < 10 entao
        A <- A + 1
      senao
        se ((precoV[i] * 100) / precoC[i]) - 100 > 20 entao
          C <- C + 1
        senao
           B <- B + 1
        fimse
      fimse
    fimpara
    
    escreval
    escreval("Lucro abaixo de 10%: ", A)
    escreval("Lucro entre 10% e 20%: ", B)
    escreval("Lucro acima de 20%: ", C)
    escreval("Valor total de compra: ", somaC:4:2)
    escreval("Valor total de venda: ", somaV:4:2)
    escreva("Lucro total: ", lucro:4:2)
    
     
Fimalgoritmo