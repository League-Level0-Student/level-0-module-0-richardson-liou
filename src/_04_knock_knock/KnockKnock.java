package _04_knock_knock;

import javax.swing.JOptionPane;

public class KnockKnock {
	public static void main(String[] args) {
		String who = JOptionPane.showInputDialog("Knock Knock");
		if (who.equals("who's there")) {
			JOptionPane.showMessageDialog(null, "Door");

		} else {
			JOptionPane.showMessageDialog(null, "Why you have to ruin the joke?");

		}
		String door = JOptionPane.showInputDialog("Door");
		if (door.equals("door who?")) {
			JOptionPane.showMessageDialog(null, "The door you are talking to thinks you are going crazy");
		
		}
		else {
			JOptionPane.showMessageDialog(null, "The door you are talking to thinks you are going crazy");
		}
	}
}