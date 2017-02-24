/* desarrollar un programa que carge los lados de un triangulo e implemente
 * los siguientes metodos: inicializar los atributos, imprimir valor del lado 
 * mayor y otro metodo que muestre si es equilatero o no */

#include <stdio.h>
int main (){
	int a,b,c;
	
	printf("ingrese lado A:\n ");
	scanf("%d",&a);
	printf("ingrese lado B:\n ");
	scanf("%d",&b);
	printf("ingrese lado C:\n ");
	scanf("%d",&c);
	
	if(a>0 && b>0 && c>0){
		if (a==b && b==c && c==a){
			printf("el triangulo es equilatero");
		}
		else{
			if(a<b){
				if(b<c){
					printf("el lado mayor es C");
					}
				else{
					if(b==c){
					printf("el lado B y C son iguales y mayores que A");
					}
					else{
						printf("el lado mayor es B");
						}
					}
				}
			else{
				if(a>c){
					if(a==b){
						printf("A y B son iguales y mayores que C");
						}
					else{
					printf("el lado mayor es A");
						}
					}
				else{
					if(a==c){
						printf("A y C son iguales y mayores que B");
						}
					else{
					printf("el lado mayor es C");
					}
				}
			}
		}

	}
	else{
		printf("el triangulo no existe");
		}
	return 0;
}
