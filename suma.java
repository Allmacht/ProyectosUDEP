/*confeccionar un programa que permite ingresar 2 numeros en controles 
 *de tipo JTextFiled, luego sumar los dos valores ingresados y mostrar la suma
 *en la barra de titulo de control JFrame*/
 
import javax.swing.*;
import java.awt.event.*;

public class suma extends JFrame implements ActionListener{
		private JButton boton1;
		private JLabel label1, label2;
		private JTextField textfield1, textfield2;
		
		private suma(){
			setLayout(null);
			label1 = new JLabel("1er numero");
			label1.setBounds(10,20,100,30);
			add (label1);
			
			label2 = new JLabel("2do numero");
			label2.setBounds(10,60,100,30);
			add (label2);
			
			textfield1 = new JTextField();
			textfield1.setBounds(150,20,100,20);
			add (textfield1);
			
			textfield2 = new JTextField();
			textfield2.setBounds(150,60,100,20);
			add (textfield2);
			
			boton1 = new JButton("resultado");
			boton1.setBounds(80,100,150,30);
			add (boton1);
			boton1.addActionListener(this);
			}
		public void actionPerformed (ActionEvent e){
			if (e.getSource()==boton1){
				String num1=textfield1.getText();
				String num2=textfield2.getText();
				int a=Integer.parseInt(num1);
				int b=Integer.parseInt(num2);
				int operacion=a+b;
				String total=String.valueOf(operacion);
				setTitle(total);
			}
		}
		public static void main(String[] ar){
			suma suma1 = new suma();
			suma1.setBounds(0,0,350,200);
			suma1.setVisible(true);
			suma1.setResizable(false);
			}
	}
