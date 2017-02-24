/*realizar una ventana que muestre el nombre de un programa en la parte superior
 *y su numero de version en la parte inferior. no permitir modificar el tamaño
 *de la ventana en tiempo de ejecucion */
 
import javax.swing.*;
public class ventana extends JFrame{
		private JLabel label1, label2;
		public ventana(){
				setLayout(null);
				label1 = new JLabel("Sistema de facturación");
				label1.setBounds(10,20,300,30);
				add (label1);
				label2 = new JLabel("Versión 1.0");
				label2.setBounds(10,100,100,30);
				add (label2);
				}
		public static void main(String[] ar){
				ventana ventana1 = new ventana();
				ventana1.setBounds(0,0,300,200);
				ventana1.setResizable(false);
				ventana1.setVisible(true);
				}
		
}
