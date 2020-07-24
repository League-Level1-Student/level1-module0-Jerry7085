package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class fc implements ActionListener{
	public void showButtom() {
		
		
		
		
		mouseClicked();
	
		
	}

	private void mouseClicked() {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		JButton b = new JButton();
		f.setVisible(true);
		f.add(b);
		f.setSize(290, 50);
		b.addActionListener(this);
		int rand = new Random().nextInt(5);
		if(rand == 1) {
			b.setText("play minecraft and you will be healthy!");
		}
		else if(rand == 0) {
			b.setText("play minecraft and you will be healthy.");
		}
		else if(rand == 2) {
			b.setText("play minecraft and you will be healthy,");
		}
		else if(rand == 3) {
			b.setText("play minecraft and you will be healthy;");
		}
		else if(rand == 4) {
			b.setText("play minecraft and you will be healthy?");
		}
		
		f.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
