

/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {

	public static void main(String[] args) {
	String number=	JOptionPane.showInputDialog("How old are you?");
	int age = Integer.parseInt(number);
	int year = 2017-age;
	System.out.println("you were born in " + year);
	if(year < 1987){
		System.out.println("you're too old to play this game");
	}
	}
	}




