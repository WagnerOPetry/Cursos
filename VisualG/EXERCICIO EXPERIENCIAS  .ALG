Algoritmo "exercicio experiencias  "


Var

   N, i, qtd, total, totalRatos, totalCoelhos, totalSapos : inteiro
   pratos, psapos, pcoelhos: real
   cobaia : caractere


Inicio

    escreva("Quantos casos de teste serao digitados? ")
    leia(N)
    
    totalRatos <- 0
    totalSapos <- 0
    totalCoelhos <- 0
    
    para i de 1 ate N faca
      escreva("Quantidade de cobaias: ")
      leia(qtd)
      
      escreva("Tipo de cobaia: ")
      leia(cobaia)
      
      se cobaia = "R" entao
         totalRatos <- totalRatos + qtd
      senao
        se cobaia = "C" entao
           totalCoelhos <- totalCoelhos + qtd
        senao
           totalSapos <- totalSapos + qtd

        fimse
      fimse
      
      total <- totalRatos + totalSapos + totalCoelhos
      pcoelhos <- totalCoelhos / total * 100
      psapos <- totalSapos / total * 100
      pratos <- totalRatos / total * 100

    fimpara
    
    escreval
    escreval("RELATORIO FINAL:")
    escreval("Total: ", total, "cobaias")
    escreval("Total de coelhos: ", totalCoelhos)
    escreval("Total de ratos: ", totalRatos)
    escreval("Total de sapos: ", totalSapos)
    escreval("Percentual de coelhos: ", pcoelhos:4:2)
    escreval("Percentual de ratos: ", pratos:4:2)
    escreval("Percentual de sapos: ", psapos:4:2)
    
     
Fimalgoritmo