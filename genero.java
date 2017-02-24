/*Disponer 2 objetos de la clase JButton con las etiquetas varon y mujer 
 *al presionarse mostrar en la barra de titulos del JFrame la etiqueta del 
 *boton presionado*/
 
import javax.swing.*;
import java.awt.event.*;

public class genero extends JFrame implements ActionListener{
		private JButton boton1, boton2;
		public genero(){
				setLayout(null);
				boton1 = new JButton("varón");
				boton1.setBounds(10,20,100,30);
				add (boton1);
				
				boton2 = new JButton("Mujer");
				boton2.setBounds(10,60,100,30);
				add (boton2);
				
				boton1.addActionListener(this);
				boton2.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e){
				if (e.getSource()==boton1){
						setTitle("Se ha presionado varón");
					}
				if (e.getSource()==boton2){
						setTitle("Se ha presionado Mujer");
					}
		}
		public static void main(String[] ar){
				genero genero1 = new genero();
				genero1.setBounds(0,0,350,200);
				genero1.setVisible(true);
				genero1.setResizable(false);
			}
}
