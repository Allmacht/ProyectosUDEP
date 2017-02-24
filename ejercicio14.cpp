/*desarrollar una clase que reprecente un cuadrado y tenga los siguientes
 * metodos, cargar el valor de su lado, imprimir su perimetro y su superficie */
 
#include <stdio.h>
int main(){
	int a,b;

	printf("Ingresar el valor de los lados: ");
	scanf("%d",&a);
	
	b=a*4;
	printf("el perimetro es: %d\n",b);
	b=a*a;
	printf("la superficie es: %d",b);
	
	return 0;
	
}
