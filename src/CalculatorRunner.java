import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorRunner implements ActionListener {

	Calculator cal = new Calculator();
	
JFrame frame = new JFrame();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JTextField field1 = new JTextField();
	JTextField field2 = new JTextField();
	int firstInt = 0;
	int secondInt = 0;
	int answer = 0;
	
	public static void main(String[] args) {
		CalculatorRunner c = new CalculatorRunner();
		c.CreateUI();
	}
	
	void CreateUI() {
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
	
		frame.add(panel);
		panel.add(field1);
		panel.add(field2);
		panel.add(add);
		panel.add(sub);
		panel.add(mul);
		panel.add(div);
		panel.add(label);
		
		frame.setVisible(true);
		frame.setSize(500, 400);
		frame.setTitle("Jacob's Calculator");
		add.setText("add");
		sub.setText("sub");
		div.setText("div");
		mul.setText("mul");
		field1.setText("first number");
		field2.setText("second number");
		label.setSize(100, 100);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton ButtonPressed = (JButton) arg0.getSource();
		
		if(ButtonPressed == add) {
		firstInt = Integer.parseInt(field1.getText());
		secondInt = Integer.parseInt(field2.getText());
			answer = cal.add(firstInt,secondInt);
			label.setText(answer + "");
		}
		
		if(ButtonPressed == sub) {
			firstInt = Integer.parseInt(field1.getText());
			secondInt = Integer.parseInt(field2.getText());
				answer = cal.subtract(firstInt,secondInt);
				label.setText(answer + "");
		}
		
		if(ButtonPressed == mul) {
			firstInt = Integer.parseInt(field1.getText());
			secondInt = Integer.parseInt(field2.getText());
				answer = cal.multiply(firstInt,secondInt);
				label.setText(answer + "");
		}
		
		if(ButtonPressed == div) {
			firstInt = Integer.parseInt(field1.getText());
			secondInt = Integer.parseInt(field2.getText());
				answer = cal.divide(firstInt,secondInt);
				label.setText(answer + "");
		}
		
	}
	
	
}
