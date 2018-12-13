import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
JFrame frame = new JFrame();
JLabel label = new JLabel();
JPanel panel = new JPanel();
char currentLetter;


public static void main(String[] args) {
	TypingTutor n = new TypingTutor();
	n.start();
}

void start(){
frame.setVisible(true);
frame.setTitle("Type or Die");
panel.add(label);
frame.add(panel);
frame.setSize(200, 200);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

label.setFont(label.getFont().deriveFont(100.0f));
label.setHorizontalAlignment(JLabel.CENTER);
frame.addKeyListener(this);

char currentLetter;
currentLetter = generateRandomLetter();
label.setText(currentLetter+"");

}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}

@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println("You typed " + arg0.getKeyChar());

	if(arg0.getKeyChar() == currentLetter) {
System.out.println("Correct");	
panel.setBackground(Color.GREEN);
}

if(arg0.getKeyChar() != currentLetter) {
	panel.setBackground(Color.RED);
}

}

@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
label.setText(currentLetter+"");
}

@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
