import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
    	
    	Robot soph = new Robot("batman");
   	 // 3. ask the user what color they would like the Robot to draw
String answer = JOptionPane.showInputDialog("what color would you like the robot to draw?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
 if (answer.equals("blue")) {
	soph.setPenColor(Color.BLUE);
}

 else if (answer.equals("red")) {
	soph.setPenColor(Color.RED);
}
	
 else{
		soph.setPenColor(Color.GRAY);
	}



   	 // 2. set the pen width to 10
  soph.setPenWidth(10);
   	 // 1. make the Robot draw a shape
  soph.penDown();
   	 soph.setSpeed(10);
   	 for (int i = 0; i < 4; i++) {
   	 soph.move(100);
   	 soph.turn(90);
   	 }
    }

}
