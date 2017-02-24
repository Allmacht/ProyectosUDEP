/* escribir un programa que solicite la carga de un numero entre 0  y 999
 * y nos muestre un mensaje de cuantos digitos tiene el mismo finalizar el
 * programa cuando se carge el valor 0 */
 
 #include <stdio.h>
 
 int main(){
		int a;
		printf("Ingrese un valor entre 0-999: \n");
		scanf("%d",&a);
		
		if(a>0){
			if(a<10){
				printf("el numero ingresado %d tiene 1 digito\n",a);
				}
			else{
				if(a>=10 && a<=99){
					printf("el numero ingresado %d tiene 2 digitos\n",a);
					}
				else{
					if(a>99 && a<=999){
						printf("el numero ingresado %d tiene 3 digitos\n",a);
						}
					else{
						if(a>999){
							printf("ingresar datos solo en el rango 0-999\n");
							}
						}
					}
				}
			}
		else{
			printf("finalizando programa...");
			return 0;
			}
	 
}
