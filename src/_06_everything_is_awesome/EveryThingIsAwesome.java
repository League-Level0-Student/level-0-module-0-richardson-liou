package _06_everything_is_awesome;

import javax.swing.JOptionPane;

public class EveryThingIsAwesome {
public static void main(String[] args) {

String answer = JOptionPane.showInputDialog("What do you like?");
JOptionPane.showMessageDialog(null, answer + " is awesome!");
}
}
