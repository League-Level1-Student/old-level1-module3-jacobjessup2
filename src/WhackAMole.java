import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.*;
public class WhackAMole implements ActionListener {

	public static void main(String[] args) {
		WhackAMole c = new WhackAMole();
		c.createUI();
		c.drawButtons();
	}
	//put date at start
	Random rand = new Random();
	int mole;
	int whacked;
JFrame frame = new JFrame("Whack-A-Button");
JPanel panel = new JPanel();
JButton button1 = new JButton("");	
JButton button2 = new JButton("");	
JButton button3 = new JButton("");	
JButton button4 = new JButton("");	
JButton button5 = new JButton("");	
JButton button6 = new JButton("");	
JButton button7 = new JButton("");	
JButton button8 = new JButton("");	
JButton button9 = new JButton("");	
JButton button10 = new JButton("");	
JButton button11 = new JButton("");	
JButton button12 = new JButton("");	

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
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	button5.addActionListener(this);
	button6.addActionListener(this);
	button7.addActionListener(this);
	button8.addActionListener(this);
	button9.addActionListener(this);
	button10.addActionListener(this);
	button11.addActionListener(this);
	button12.addActionListener(this);
	button1.setText("empty");
	button2.setText("empty");
	button3.setText("empty");
	button4.setText("empty");
	button5.setText("empty");
	button6.setText("empty");
	button7.setText("empty");
	button8.setText("empty");
	button9.setText("empty");
	button10.setText("empty");
	button11.setText("empty");
	button12.setText("empty");
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

private void endGame(Date timeAtStart, int molesWhacked) {
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
         + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
         + " moles per second.");
}

@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	
	if(buttonPressed.getText().equals("empty")) {
	
		speak("That's not a mole");
		frame.dispose();
		createUI();
		drawButtons();
		
	}

	if(buttonPressed.getText().equals("MOLE!")) {
		
		
		speak("oof");
		frame.dispose();
		createUI();
		drawButtons();
		whacked++;
		if(whacked == 9) {
			endGame(whacked);
		}
	}
	
	
	
}


}










