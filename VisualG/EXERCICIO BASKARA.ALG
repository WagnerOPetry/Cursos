Algoritmo "exercicio baskara"

Var

  a, b , c, x1, x2, delta : real

Inicio

  escreva("Coeficiente a: ")
  leia(a)
  escreva("Coeficiente b: ")
  leia(b)
  escreva("Coeficiente c: ")
  leia(c)
  
   delta <- Exp(b, 2) - 4 * a * c
   
   se (a = 0) ou (delta < 0) entao
       escreval("Esta equacao nao possiu raizes reais")
   fimse
   
   x1 <- (-b + (raizQ(delta))) / (2 * a)
   x2 <- (-b - (raizQ(delta))) / (2 * a)
   
   escreval("x1 = ", x1:8:4)
   
   escreval("x2 = ", x2:8:4)

  
Fimalgoritmo