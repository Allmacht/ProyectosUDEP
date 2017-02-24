/*crear 3 objetos de la clase JLabel ubicarlos uno debajo del otro y mostrar
 *nombres de colores*/
 
import javax.swing.*;
public class Colores extends JFrame{
	private JLabel label1, label2, label3;
	public Colores(){
		setLayout(null);
		label1 = new JLabel("Verde");
		label1.setBounds(10,20,100,30);
		add (label1);
		label2 = new JLabel("Rojo");
		label2.setBounds(10,60,100,30);
		add(label2);
		label3 = new JLabel("Amarillo");
		label3.setBounds(10,100,100,30);
		add (label3);
	}
	public static void main(String[] ar){
		Colores Colores1 = new Colores();
		Colores1.setBounds(0,0,300,200);
		Colores1.setResizable(false);
		Colores1.setVisible(true);
	}
}
