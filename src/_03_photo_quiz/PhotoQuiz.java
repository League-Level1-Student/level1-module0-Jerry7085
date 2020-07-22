package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame qw = new JFrame();
		qw.setVisible(true);
		// This will make sure the program exits when you close the window
		qw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		
		// 2. create a variable of type "Component" that will hold your image
		
		
		String url = "https://cdn.vox-cdn.com/thumbor/_n1jODtU4MKAU6VJmMta_WK9BZA=/0x0:1920x1080/1200x675/filters:focal(807x387:1113x693)/cdn.vox-cdn.com/uploads/chorus_image/image/65650200/jbareham_191158_ply0958_decade_minecraft.0.jpg";
		Component component = createImage(url);
			
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		qw.add(component);
		// 5. call the pack() method on the quiz window
		qw.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("What is the name of this game?");
		// 7. print "CORRECT" if the user gave the right answer
		if(answer.equalsIgnoreCase("minecraft")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect!");
		}
		
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		qw.remove(component);
		// 10. find another image and create it (might take more than one line
		// of cod)
		String uri = "https://upload.wikimedia.org/wikipedia/en/3/3d/PlayerUnknown%27s_Battlegrounds_Steam_Logo.jpg";
		// 11. add the second image to the quiz window
		component = createImage(uri);
		qw.add(component);
		// 12. pack the quiz window
		qw.pack();
		// 13. ask another question
		String question = JOptionPane.showInputDialog("What is the name of this game?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(question.equalsIgnoreCase("pubg")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect! And you shall be put to death!");
		}
		qw.remove(component);
		qw.pack();
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
