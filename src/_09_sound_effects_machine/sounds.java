package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class sounds implements ActionListener {
	int c = 0;
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	JButton b2 = new JButton();
	
	public void soundsRunner() {
		f.setVisible(true);
		f.setLocationRelativeTo(null);
		b.setText("bling");
		b2.setText("Blop");
		p.add(b);
		p.add(b2);
		f.add(p);
		f.pack();
		b.addActionListener(this);
		b2.addActionListener(this);
		
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(b == e.getSource()) {
			playSound("bling.wav");
			
		}
		if(b2 == e.getSource()) {
			playSound("blop.wav");
		}
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
	     sound.play();

}
}
