import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
public class WhackAMole implements ActionListener {

	public static void main(String[] args) {
		WhackAMole c = new WhackAMole();
		c.createUI();
		c.drawButtons();
	}
	
	Random rand = new Random();
	int mole;
JFrame frame = new JFrame("Whack-A-Button");
JPanel panel = new JPanel();
JButton button1 = new JButton("empty");	
JButton button2 = new JButton("empty");	
JButton button3 = new JButton("empty");	
JButton button4 = new JButton("empty");	
JButton button5 = new JButton("empty");	
JButton button6 = new JButton("empty");	
JButton button7 = new JButton("empty");	
JButton button8 = new JButton("empty");	
JButton button9 = new JButton("empty");	
JButton button10 = new JButton("empty");	
JButton button11 = new JButton("empty");	
JButton button12 = new JButton("empty");	

void createUI() {
	frame.setVisible(true);
	frame.setSize(300,150);
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	panel.add(button5);
	panel.add(button6);
	panel.add(button7);
	panel.add(button8);
	panel.add(button9);
	panel.add(button10);
	panel.add(button11);
	panel.add(button12);
	button1.addActionListener(this);
}

void drawButtons() {
	mole = rand.nextInt(12);
	if(mole == 0) {
		button1.setText("MOLE!");
	}
	
	if(mole == 1) {
		button2.setText("MOLE!");
	}
	
	if(mole == 2) {
		button3.setText("MOLE!");
	}
	
	if(mole == 3) {
		button4.setText("MOLE!");
	}
	
	if(mole == 4) {
		button5.setText("MOLE!");
	}
	if(mole == 5) {
		button6.setText("MOLE!");
	}
		
	if(mole == 6) {
		button7.setText("MOLE!");
	}
		
	if(mole == 7) {
		button8.setText("MOLE!");
	}
	
	if(mole == 8) {
		button9.setText("MOLE!");
	}
	
	if(mole == 9) {
		button10.setText("MOLE!");
	}
	
	if(mole == 10) {
		button11.setText("MOLE!");
	}
	
	if(mole == 11) {
		button12.setText("MOLE!");
	}
	
	
	







}

void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed.getText().equals("empty")) {
		speak("That's not a mole");
		
		
	}
}


}










