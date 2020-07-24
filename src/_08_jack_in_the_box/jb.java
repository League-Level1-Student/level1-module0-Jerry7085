package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class jb implements ActionListener {
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	int c = 0;
	public void sb (){
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.add(b);
		f.add(p);
		f.setSize(500, 500);
		f.setLocationRelativeTo(null);
		b.setText("Click me");
		b.addActionListener(this);
		f.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(b == e.getSource()) {
			c = c+1;
			
		}
		if(c == 5) {
			showPicture("jackInTheBox.png");
			playSound("homer-woohoo.wav");
		}
	}
	private Component createImage(String url) {
		// TODO Auto-generated method stub
		return null;
	}
	private void showPicture(String fileName) { 
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	private JLabel createLabelImage(String fileName) {
	     try {
	          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}
	private void playSound(String soundFile) { 
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
