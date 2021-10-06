Algoritmo quitarIVA
	Escribir 'Introduzca el precio:'
	Leer precio
	Escribir 'Que tipo de iva se aplica (21%, 10%, 4%):'
	Leer tipoIVA
	Escribir ' '
	tipoIVA <- tipoIVA/100
	precioSin <- (precio/(1+tipoIVA))
	cantidadIVA <- precio-precioSin
	Escribir 'La cantidad de IVA es:'
	Escribir cantidadIVA
	Escribir ' '
	Escribir 'El precio sin iva es: '
	Escribir precioSin
FinAlgoritmo
