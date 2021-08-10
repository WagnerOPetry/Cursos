Algoritmo "exercício pagamento"

Var

   nome : caractere
   valorHora, pagamento : real
   horasTrabalhadas : inteiro
   

Inicio

   escreva("Nome: ")
   leia(nome)
   escreva("valor por hora: ")
   leia(valorHora)
   escreva("Horas trabalhadas: ")
   leia(horasTrabalhadas)
   
   pagamento <- valorHora * horasTrabalhadas
   escreval("O pagamento de ", nome, " deve ser ", pagamento:8:2)

Fimalgoritmo