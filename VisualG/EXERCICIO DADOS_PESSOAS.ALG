Algoritmo "exercicio dados_pessoas"


Var

   N, i : inteiro
   alturas : vetor [0..9] de real
   generos : vetor [0..9] de caractere
   soma, media, menoraltura, maiorAltura : real
   contM, contF: real


Inicio

    escreva("Quantas pessoas serao digitadas? ")
    leia(N)
    
    para i de 0 ate N-1 faca
      escreva("Altura da ", i+1, " a pessoa: ")
      leia(alturas[i])
      escreva("Genero da ", i+1, " a pessoa: ")
      leia(generos[i])
    fimpara
    
    menorAltura <- alturas[0]
    para i de 0 ate N-1 faca
       se alturas[i] < menorAltura entao
          menorAltura <- alturas[i]
          escreval("Menor Altura = ", menorAltura)
       fimse
    fimpara
    
    maiorAltura <- alturas[0]
    para i de 0 ate N-1 faca
      se alturas[i] > maiorAltura entao
        maiorAltura <- alturas[i]
        escreval("Maior Altura = ", maiorAltura)
      fimse
    fimpara

    contM <- 0
    contF <- 0
    para i de 0 ate N-1 faca
      se generos[i] = "M" entao
         contM <- contM + 1
      senao
         contF <- contF + 1
      fimse
    fimpara
    
    soma <- 0
    para i de 0 ate N-1 faca
      se generos[i] = "F" entao
        soma <- soma + alturas[i]
      fimse
    fimpara

    media <- soma / contF
    
    escreval("Media das alturas das mulheres = ", media:4:2)
    
    escreval("Numero de homens = ", contM)
    
    
    


     
Fimalgoritmo