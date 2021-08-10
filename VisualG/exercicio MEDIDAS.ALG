Algoritmo "medidas"

Var

   A, B, C, areaQ, areaT, areaTra : real

Inicio

   escreva("Digite a medida de A: ")
   leia(A)
   escreva("Digite a medida de B: ")
   leia(B)
   escreva("Digite a medida de C: ")
   leia(C)
   
   areaQ <- A * A
   areaT <- (A * B) / 2
   areaTra <- (A + B) * C / 2
   
   escreval("AREA DO QUADRADO = ", areaQ:8:4)
   escreval("AREA DO TRIANGLO = ", areaT:8:4)
   escreval("AREA DO TRAPEZIO = ", areaTra:8:4)
Fimalgoritmo