Algoritmo Ordenar3Numeros
	Leer a,b,c
	Si a>c Entonces
		aux <- a
		a <- c
		c <- aux
	FinSi
	// a es menor que c
	Si a>b Entonces
		aux <- a
		a <- b
		b <- aux
	FinSi
	// a es menor que c y que b
	Si b>c Entonces
		aux <- b
		b <- c
		c <- aux
	FinSi
	// a es menor que c y que b, y b es menor que c
	Escribir a,b,c
FinAlgoritmo
