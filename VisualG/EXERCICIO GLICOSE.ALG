Algoritmo "exercicio glicose"


Var

   glicose : real
   classificacao : caractere


Inicio

    escreva("Digite a medida da glicose: ")
    leia(glicose)
    
    se glicose > 140 entao
       escreva("Diabetes")
    senao
      se (glicose > 101) e (glicose <= 140) entao
          escreva("Elevado")
      senao
          escreva("Normal")
      fimse
    fimse
    
Fimalgoritmo