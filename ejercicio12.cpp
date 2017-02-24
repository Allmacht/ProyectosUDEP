/* realizar una clase que permita cargar el nombre y la edad de una persona
 * mostrar los datos cargados y finalmente imprimir un mensaje si es mayor de
 * edad o no */
 
 #include <stdlib.h>
 #include <stdio.h>
 
 int main (){
 char nombre[40];
 int edad;
 
 printf("Ingrese el nombre: ");
 scanf("%s",&nombre);
 
 printf("ingrese edad: ");
 scanf("%d",&edad);
 
 if(edad>=18)
	printf("la persona %s es mayor de edad",nombre);
 else{
	 printf("la persona %s es menor de edad",nombre);
	 }
return 0;
 } 
