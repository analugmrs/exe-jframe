package cadastro;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		
		JFrame forms = new JFrame();
		JLabel labelContent = new JLabel("Example");
		
		forms.setSize(400, 300);
		forms.setTitle("Window Example");
		forms.setLocation(10,10);
		
		forms.add(labelContent);
		
		forms.setVisible(true);
		
		forms.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
