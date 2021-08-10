Algoritmo "exercicio aumento"


Var

    salario, porcentagem, aumento, novo: real



Inicio

    escreva("Digite o salario da pessoa: ")
    leia(salario)
    
    se salario <= 1000 entao
       aumento <- salario * 0.2
       porcentagem <- 20
       novo <- (salario + aumento)
       escreval("Novo salario = R$ ", novo:4:2)
       escreval("Aumento = R$ ", aumento:4:2)
       escreval("Porcentagem = ", porcentagem, "%")
       
    senao
      se salario < 3000 entao
        aumento <- salario * 0.15
        porcentagem <- 15
        novo <- salario + aumento
        escreval("Novo salario = R$ ", novo:4:2)
        escreval("Aumento = R$ ", aumento:4:2)
        escreval("Porcentagem = ", porcentagem, "%")
        
      senao
         se salario <= 8000 entao
           aumento <- salario * 0.1
           porcentagem <- 10
           novo <- salario + aumento
           escreval("Novo salario = R$ ", novo:4:2)
           escreval("Aumento = R$ ", aumento:4:2)
           escreval("Porcentagem = ", porcentagem, "%")
        
         senao
           aumento <- salario * 0.05
           porcentagem <- 5
           novo <- salario + aumento
           escreval("Novo salario = R$ ", novo:8:2)
           escreval("Aumento = R$ ", aumento:8:2)
           escreval("Porcentagem = ", porcentagem, "%")
           
         fimse
      fimse
   fimse
Fimalgoritmo