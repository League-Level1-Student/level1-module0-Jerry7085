package _06_duelling_buttons;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuelingButtons implements ActionListener {

	JButton lb = new JButton();
	JButton rb = new JButton();

	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);

	JFrame f = new JFrame();
	JPanel p = new JPanel();

	public void run() {

		// 1. Add the panel to the frame
		f.add(p);
		// 2. Make the frame visible
		f.setVisible(true);
		// 3. Set the text of the leftButton to "Click me!"
		lb.setText("Clike me");
		// 4. Set the text of the rightButton to "Click me!"
		rb.setText("clike me");
		// 5. Add an action listener to the leftButton
		lb.addActionListener(this);
		// 6. Add an action listener to the rightButton

		// 7. Add the leftButton to the panel

		// 8. Add the rightButton to the panel

		// 9. Pack the frame

		// 10. Set the title of the frame to "Demanding Buttons"

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		/* If the buttonPressed was the leftButton.... */
		// Set the text of the rightButton to "No, click Me!"
		// Set the PREFERRED size of the rightButton to BIG
		// Set the text of the leftButton to "Click Me!"
		// Set the PREFERRED size of the leftButton to SMALL

		/* If the buttonPressed was the rightButton, do the opposite. */

		f.pack();
	}
}
