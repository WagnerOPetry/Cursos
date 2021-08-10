Algoritmo "exercicio aprovados"


Var

   N, i : inteiro
   nomes : vetor [0..9] de caractere
   nota1 : vetor [0..9] de real
   nota2 : vetor [0..9] de real
   media : real

Inicio

   escreva("Quantos alunos serao digitados?")
   leia(N)

   para i de 0 ate N-1 faca
      escreval("Digite nome, primeira e segunda nota do ", i+1, "o aluno:")
      leia(nomes[i])
      leia(nota1[i])
      leia(nota2[i])
   fimpara

   escreval("Alunos aprovados:")
   para i de 0 ate N-1 faca
      media <- (nota1[i] + nota2[i]) / 2
      se media >= 6 entao
         escreval(nomes[i])
      fimse
   fimpara


Fimalgoritmo