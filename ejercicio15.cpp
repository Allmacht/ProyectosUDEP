/* implementar la clase operaciones, cargar 2 valores enteros, realizar 
 * suma, resta, multiplicacion y división */
 
 #include <stdio.h>
 
 int main(){
	float a,b;
	float suma,resta,multi,divi;
	printf("ingresar el primer valor: ");
	scanf("%f",&a);
	printf("ingresar el segundo valor: ");
	scanf("%f",&b);
	
	suma=a+b;
	resta=a-b;
	multi=a*b;
	divi=a/b;
	printf("la suma es: %f\n",suma);
	printf("la resta es: %f\n",resta);
	printf("la multiplicacion es: %f\n",multi);
	printf("la division es: %f\n",divi);
	
	return 0;
	 
 }
