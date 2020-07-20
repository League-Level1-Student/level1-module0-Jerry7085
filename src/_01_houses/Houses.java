package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
	
	
		building();
		building();
		building();
		building();
		building();
		
	}


static void building() {
	Robot j = new Robot();
	Random ran = new Random();
	int rand = ran.nextInt(120-30+1)+30;
	
	
	j.setSpeed(30);
	j.penDown();
	j.setAngle(0);
	j.setRandomPenColor();
	j.move(rand);
	j.turn(90);
	j.move(30);
	j.turn(90);
	j.move(rand);
	j.turn(-90);
	j.setPenColor(Color.green);
	j.move(30);
	
}
}
