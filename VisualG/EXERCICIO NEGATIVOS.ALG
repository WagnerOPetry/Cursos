Algoritmo "exercicio negativos"


Var

     N, i : inteiro
     vet : vetor [0..9] de real


Inicio

    escreva("Quantos numeros voce vai digitar? ")
    leia(N)
    
    para i de 0 ate N-1 faca
       escreva("Digite um numero: ")
       leia(vet[i])
    fimpara
    
    escreval("Numeros negativos:")
    
    para i de 0 ate N-1 faca
    
      se vet[i] < 0 entao
        escreval(vet[i])
      fimse
      
    fimpara
    
    
     
Fimalgoritmo