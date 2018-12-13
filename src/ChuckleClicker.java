import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton();
	JButton punchline = new JButton();
	
	public static void main(String[] args) {
		ChuckleClicker n = new ChuckleClicker();
	n.makeButtons();
	}
	
	void makeButtons(){
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setSize(200, 50);
	frame.setTitle("Dad joke");
	
		panel.add(joke);
		panel.add(punchline);
		frame.add(panel);
		
	joke.addActionListener(this);
	punchline.addActionListener(this);
	joke.setText("Joke");
	punchline.setText("PUNchline");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		
		if(buttonPressed == joke) {
			JOptionPane.showMessageDialog(null, "Today at the bank, an old lady asked me to help check her balance");
		}
	
		if(buttonPressed == punchline) {
			JOptionPane.showMessageDialog(null, "So I pushed her over");
		}
	
	
	}

}
