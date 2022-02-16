Algoritmo Ecaucion segundo grado
	Leer a,b,c
	Si a=0 Entonces
		Si b=0 Entonces
			Escribir No es una ecuación
		SiNo
			x1 <- -c/b
			Escribir x1
		FinSi
	SiNo
		radicando = b*b-4*a*c
		Si radicando >=0 Entonces
			x1 <- (-b+sqrt(radicando))/(2*a)
			x2 <- (-b-sqrt(radicando))/(2*a)
			Escribir x1,x2
		SiNo
			Escribir Tiene soluciones imaginarias
		FinSi
	FinSi
FinAlgoritmo
