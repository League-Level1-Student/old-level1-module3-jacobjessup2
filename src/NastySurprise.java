import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
JFrame frame = new JFrame();
JButton trick = new JButton();
JButton treat = new JButton();
JPanel panel = new JPanel();

public static void main(String[] args) {
	NastySurprise n = new NastySurprise();
	n.start();
}


private void start() {
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	panel.add(treat);
	panel.add(trick);
	trick.setText("Trick");
	treat.setText("Treat");
	trick.addActionListener(this);
	treat.addActionListener(this);
	frame.setVisible(true);
	panel.setVisible(true);
	frame.setSize(200, 50);
}




@Override
public void actionPerformed(ActionEvent arg0) {
	
JButton buttonPressed = (JButton) arg0.getSource();	

	if(buttonPressed == trick) {
		showPictureFromTheInternet("https://upload.wikimedia.org/wikipedia/commons/thumb/6/6e/Golde33443.jpg/280px-Golde33443.jpg");
	}

	if(buttonPressed == treat) {
		showPictureFromTheInternet("https://s.yimg.com/ny/api/res/1.2/mwc14MXj1u6JF7ATQe_r7A--~A/YXBwaWQ9aGlnaGxhbmRlcjtzbT0xO3c9ODAw/http://media.zenfs.com/en/homerun/feed_manager_auto_publish_494/ffb58a3a982e24cbf11bbabcb0665842");
	}
}
private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}
}

