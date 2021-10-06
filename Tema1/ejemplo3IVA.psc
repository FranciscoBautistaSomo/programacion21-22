Algoritmo quitarIVA
	Escribir 'Introduzca el precio con iva:'
	Escribir " "
	Leer precio
	cantidadIVA <- precio - ( precio / 1.21)
	precioFREE <- precio - cantidadIVA
	Escribir 'La cantidad de IVA es:'
	Escribir cantidadIVA
	Escribir " "
	Escribir 'El precio sin iva es: '
	Escribir precioFREE
FinAlgoritmo
