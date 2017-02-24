/* una planta que fabrica perfiles de hierro posee un lote de N piezas,
 * realizar un programa que pida ingresar por teclado la cantidad de piezas
 * a procesar y luego ingrese la longitud de cada perfil, sabiendo que la pieza
 * cuya longitud este comprendida en el rango de 1.20 y 1.30 son aptas. 
 * imprimir por pantalla la cantidad de piezas aptas que hay en el lote */
 #include <stdio.h>
 
int main (){
	int a,b,c;
	float d;
		
	printf("ingrese la cantidad de piezas: ");
	scanf("%d",&c);
	a=1;
	b=0;
	
	while(a<=c){
		printf("Ingrese longitud de la pieza n°%d: ",a);
		scanf("%f",&d);
		if(d>=1.20 && d<=1.30){
			b=b+1;
			}
			a=a+1;
		}
	printf("el numero de piezas aptas son: %d",b);
	return 0;	
}
