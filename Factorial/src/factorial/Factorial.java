/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.util.Scanner;
/**
 *
 * @author Ulises Jacob CR
 */
public class Factorial {
    void factorialEjemplo(){
      Scanner teclado = new Scanner(System.in);
      int Numero = teclado.nextInt();
      int temp=Numero;
      while(Numero>1){
          Numero--;
          temp=temp*Numero;
      }
      
      System.out.println(temp);
    }
    public static void main(String[] args) {
        Factorial Factorial1;
        Factorial1 = new Factorial();
        Factorial1.factorialEjemplo();
    }
    
}
