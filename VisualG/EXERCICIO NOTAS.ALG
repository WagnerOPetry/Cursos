Algoritmo "exercicio notas"

Var

   nota1, nota2, media : real
   

Inicio

   escreva("Digite a primeira nota: ")
   leia(nota1)
   escreva("Digite a segunda nota: ")
   leia(nota2)
   
   media <- nota1 + nota2
   
   escreval("NOTA FINAL: ", media:8:1)
   
   se media > 60 entao
      escreva("APROVADO")
   senao
      escreva("REPROVADO")
   fimse
Fimalgoritmo