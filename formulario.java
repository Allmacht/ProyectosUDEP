/* confeccionar un programa hola mundo utilizando una interfaz grafica de usuario*/
import javax.swing.*;

public class formulario extends JFrame{
	private JLabel Label1;
	
	public formulario(){
		setLayout(null);
		Label1 = new JLabel ("Hola mundo");
		Label1.setBounds(10,20,200,30);
		add (Label1);
	}
	public static void main(String[]ar){
		formulario formulario1 = new formulario();
		formulario1.setBounds(10,10,400,300);
		formulario1.setVisible(true);
	}
}
