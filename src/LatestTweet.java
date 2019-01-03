import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LatestTweet implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	JTextField textField = new JTextField();
	
	public static void main(String[] args) {
		LatestTweet w = new LatestTweet();
		w.CreateUI();
	}
	
	
	void CreateUI(){
		frame.setVisible(true);
		frame.setSize(350,200);
		frame.add(panel);
		panel.add(textField);
		panel.add(button);
		textField.setText("This is a Tweet");
		button.addActionListener(this);
		button.setText("Search the Twitterverse");
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton ButtonPressed = (JButton) arg0.getSource();
		 if(ButtonPressed == button) {
			 System.out.println("Tweet, Tweet");
		 }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
