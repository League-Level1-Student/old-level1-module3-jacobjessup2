import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PGL implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField textField1 = new JTextField();
	JTextField textField2 = new JTextField();
	JButton button = new JButton();
	PigLatinTranslator pig = new PigLatinTranslator();
	
	
	public static void main(String[] args) {
		PGL j = new PGL();
	j.createUI();
	}
	
	void createUI(){
		frame.setVisible(true);
		frame.setSize(500, 50);
		frame.add(panel);
		panel.add(textField1);
		panel.add(button);
		panel.add(textField2);
		button.setText("Translate");
		button.addActionListener(this);
		textField1.setText("Input of English");
		textField2.setText("Output of Pig Latin");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton ButtonPressed = (JButton) e.getSource();
			if(ButtonPressed == button) {
			String PigLatin = pig.translate(textField1.getText());
			textField2.setText(PigLatin);
		}
	}
	
	
	
	
	
}
