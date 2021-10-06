Algoritmo resolverEcuacion1
	Escribir 'Programa para resolver ecuaciones de segundo grado (a*x+b=c)'
	Escribir 'Introduzca el valor de a'
	Escribir  ' '
	Leer a
	Si a=0 Entonces
			Escribir 'La operación no se puede realizar'
		SiNo
			Escribir 'Introduzca el valor de b'
			Escribir  ' '
			Leer b
			Escribir 'Introduzca el valor de c'
			Escribir  ' '
			Leer c
			x<- (c-b)/a
			Escribir 'El valor de la incognita es: '
			Escribir x
		Fin Si		
FinAlgoritmo
