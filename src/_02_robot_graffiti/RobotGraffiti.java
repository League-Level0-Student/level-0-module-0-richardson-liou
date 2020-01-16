package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	public static void main(String[] args) {
		Robot someone = new Robot ();
		someone.penDown();
		someone.setSpeed(255);
		someone.setRandomPenColor();
		someone.setPenWidth(30);
		for(int i=0; i<20; i++) {
			someone.move(10);
			someone.setRandomPenColor();
		}
		someone.turn(90);
		
		for(int i=0; i<180; i++) {
			someone.move(1);
			someone.turn(1);
			someone.setRandomPenColor();
		}
		someone.setAngle(135);
		for(int i=0; i<10; i++) {
		someone.move(10);
		someone.setRandomPenColor();
		}
		someone.penUp();
		someone.move(100);
	}
}
