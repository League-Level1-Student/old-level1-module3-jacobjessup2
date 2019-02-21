import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;
public class SlotMachine implements ActionListener {
	
	
public static void main(String[] args) {
	SlotMachine j = new SlotMachine();
	try {
		j.createUI();
		j.SPIN();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	

	JFrame frame = new JFrame("Slot Machine");
	JPanel panel = new JPanel();
	JButton button = new JButton("SPIN");
	BufferedImage im;
	JLabel label = new JLabel();
	Random rand = new Random();
	int slot1;
	int slot2;
	int slot3;
	
	void createUI () throws Exception{
		im =  ImageIO.read(this.getClass().getResourceAsStream("Cherry.jpeg"));
		frame.setVisible(true);
		frame.setSize(675, 300);
		frame.add(panel);
		panel.add(label);
		label.setIcon(new ImageIcon(im));
		panel.add(button);
		button.addActionListener(this);
	}
	
	void SPIN() {
	 slot1 = rand.nextInt(3);
	 slot2 = rand.nextInt(3);
	 slot3 = rand.nextInt(3);
 }
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
