/*Realizar una ventana que muestre un botón cuando se presione finalizar 
 *la ejecución del programa java*/

import javax.swing.*;
import java.awt.event.*;

public class Boton extends JFrame implements ActionListener{
	JButton boton1;
	public Boton() {
		setLayout(null);
		boton1 = new JButton("Finalizar");
		boton1.setBounds(300,250,100,30);
		add (boton1);
		boton1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==boton1){
			System.exit(0);
		}
	}
	public static void main(String[] ar){
		Boton Boton1 = new Boton();
		Boton1.setBounds(0,0,450,350);
		Boton1.setVisible(true);
	}
}
