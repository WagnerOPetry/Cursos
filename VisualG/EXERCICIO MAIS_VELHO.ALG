Algoritmo "exercicio mais_velho"


Var

    N, i : inteiro
    nomes : vetor [0..9] de caractere
    idades : vetor [0..9] de inteiro
    velho : caractere

Inicio

    escreva("Quantas pessoas voce vai digitar? ")
    leia(N)
    
    para i de 0 ate N-1 faca
      escreval("Dados da ", i+1, "a pessoa:")
      escreva("Nome: ")
      leia(nomes[i])
      escreva("Idade: ")
      leia(idades[i])
    fimpara
    
    velho <- nomes[0]
    para i de 0 ate N-1 faca
      se nomes[i] < velho entao
         velho <- nomes[i]
      fimse
    fimpara
    
    escreval
    escreva("Pessoa mais velha: ", velho)
      



     
Fimalgoritmo