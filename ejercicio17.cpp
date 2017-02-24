/* realizar un programa que permita ingresar el peso en kg de piezas el proceso 
 * termina cuando ingresamos el valor 0, se debe informar: a
 * A) cuantas piezas tiene un peso entre 9.8 kg y 10.2 kg
 * cuantas con mas de 10.2 kg y cuantas con menos de 9.8 kg.
 * B) la cantidad total de piezas procesadas */
 
#include <stdio.h>

int main(){
	int a,c,d,e,f;
	float b;
	
	printf("ingese el numero de piezas a procesar: \n");
	scanf("%d",&a);
	c=1;
	e=0;
	d=0;
	f=0;
	while(c<=a){
		printf("ingrese el peso de pieza n°%d: ",c);
		scanf("%f",&b);
		if(b>=9.8 && b<=10.2){
			d=d+1;
		}
		else{
			if(b<9.8){
				e=e+1;
			}
			else{
				if(b>10.2){
					f=f+1;
				}
			}
		}
		c=c+1;
	}
	printf("piezas entre 9.8 y 10.2= %d\n",d);
	printf("piezas menores a 9.8=%d\n",e);
	printf("piezas mayores a 10.2=%d\n",f);
	printf("el numero total de piezas son: %d",a);
}
