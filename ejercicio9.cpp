/* escribir programa que solicite la carga de un valor positivo y muestre 
 * desde 1 hasta el valor ingresado de uno en uno */
 
 #include <stdio.h>
 
 int main (){
	int a=1;
	int b;
	printf("ingrese el numero maximo: ");
	scanf("%d",&b);
	
	while(a<=b){
		printf("%d\n",a);
		a++;
	}
	return 0;
 }
