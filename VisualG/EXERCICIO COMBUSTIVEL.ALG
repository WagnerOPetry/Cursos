Algoritmo "exercicio combustivel"


Var

    Alcool, Gasolina, Diesel, codigo : inteiro


Inicio

    escreva("Informe um codigo (1, 2, 3) ou 4 para parar: ")
    leia(codigo)
    
    Alcool <- 0
    Gasolina <- 0
    Diesel <- 0

    enquanto codigo <> 4 faca
    
    escolha codigo
    caso 1
       Alcool <- Alcool + 1
    caso 2
       Gasolina <- Gasolina + 1
    caso 3
       Diesel <- Diesel + 1
    fimescolha

    escreva("Informe um codigo (1, 2, 3) ou 4 para parar: ")
    leia(codigo)
      
      se codigo = 4 entao
        escreval("MUITO OBRIGADO")
      fimse
      
       fimenquanto
    
    escreval("Alcool: ", Alcool)
    escreval("Gasolina: ", Gasolina)
    escreval("Diesel: ", Diesel)
    
    
    
     
Fimalgoritmo