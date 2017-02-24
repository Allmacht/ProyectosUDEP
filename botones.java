/*realizar una ventana que contenga 3 objetos de la clase JButton con las 
 *etiquetas 1 2 y 3 al precionarse cambiar el titulo del JFrame indicando 
 *que boton se preciono*/
import javax.swing.*;
import java.awt.event.*;

public class botones extends JFrame implements ActionListener{
		private JButton boton1, boton2, boton3;
		public botones(){
				setLayout(null);
				boton1 = new JButton("1");
				boton1.setBounds(10,20,100,30);
				add (boton1);
				
				boton2 = new JButton("2");
				boton2.setBounds(10,60,100,30);
				add (boton2);
				
				boton3 = new JButton("3");
				boton3.setBounds(10,100,100,30);
				add (boton3);
				
				boton1.addActionListener(this);
				boton2.addActionListener(this);
				boton3.addActionListener(this);
			}
		public void actionPerformed(ActionEvent e){
				if (e.getSource()==boton1){
						setTitle("Se ha presionado el boton 1");
					}
				if (e.getSource()==boton2){
						setTitle("Se ha presionado el boton 2");
					}
				if (e.getSource()==boton3){
						setTitle("Se ha presionado el boton 3");
					}
			}
		public static void main(String[] ar){
				botones botones1 = new botones();
				botones1.setBounds(0,0,350,200);
				botones1.setVisible(true);
				botones1.setResizable(false);
			}
}
