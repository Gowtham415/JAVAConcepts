import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class RobotClassDemo {
	
	public static void main(String[] args) {
		try {
			Robot robot = new Robot();
			Scanner scan = new Scanner(System.in);
			int i= scan.nextInt();
			robot.keyPress(KeyEvent.VK_0);
			System.out.println(i);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
