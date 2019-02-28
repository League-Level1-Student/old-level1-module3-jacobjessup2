import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;
public class SlotMachine implements ActionListener {
	
	
public static void main(String[] args) {
	SlotMachine j = new SlotMachine();
	try {
		j.createUI();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	

	JFrame frame = new JFrame("Slot Machine");
	JPanel panel = new JPanel();
	JButton button = new JButton("SPIN");
	ImageIcon cherry;
	ImageIcon orange;
	ImageIcon strawberry;
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	Random rand = new Random();
	int slot1;
	int slot2;
	int slot3;
	
	void createUI () throws Exception{
		cherry =  new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("Cherry.jpeg")));
		orange =  new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("Orange.jpeg")));
		strawberry =  new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("Strawberry.jpeg")));
		frame.setVisible(true);
		frame.setSize(700, 300);
		frame.add(panel);
		label1.setIcon(cherry);
		label2.setIcon(cherry);
		label3.setIcon(cherry);
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(button);
		button.addActionListener(this);
	}
	
	
	
	void SPIN() throws Exception {
		
		
	 slot1 = rand.nextInt(3);
	 slot2 = rand.nextInt(3);
	 slot3 = rand.nextInt(3);
	 //slot 1
	 if (slot1 == 0) {
		 label1.setIcon(cherry);
	 	}
	 if (slot1 == 1) {
		 label1.setIcon(orange);
	 	}
	 if (slot1 == 2) {
		 label1.setIcon(strawberry);
	 	}
	 //slot 2
	 if (slot2 == 0) {
		 label2.setIcon(cherry);
	 	}
	 if (slot2 == 1) {
		 label2.setIcon(orange);
	 	}
	 if (slot2 == 2) {
		 label2.setIcon(strawberry);
	 	}
	 //slot 3
	 if (slot3 == 0) {
		 label3.setIcon(cherry);
	 	}
	 if (slot3 == 1) {
		 label3.setIcon(orange);
	 	}
	 if (slot3 == 2) {
		 label3.setIcon(strawberry);
	 	}
	 
 }
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == button) {
			try {
				SPIN();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
