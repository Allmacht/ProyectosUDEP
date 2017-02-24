/* escribir un programa que solicite ingresar 10 notas de alumnos 
 * y nos informen cuantos tienen notas mayores o iguales a 7 y cuantos
 * menores*/
 
#include <stdio.h>

int main (){
	int a,b,c,d;
	
	a=1;
	d=0;
	c=0;
	while(a<=10){
		printf("Ingrese la nota n°%d\n",a);
		scanf("%d",&b);
		if(b>=7){
		c=c+1;
		}
		else{
		d=d+1;
		}
		a=a+1;
	}
	printf("los alumnos con notas mayores a 7 son: %d\n",c);
	printf("los alumnos con notas menores a 7 son: %d\n",d);
	return 0;	
}
