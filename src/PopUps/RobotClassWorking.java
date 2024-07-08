package PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotClassWorking {
public static void main(String[] args) throws AWTException {
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL); 
	//if we use KeyPress then it is manadatory  to release that Key with the help of KeyRelease 
	robot.keyPress(KeyEvent.VK_A);
	//robot.keyPress(KeyEvent.VK_B);
    robot.keyRelease(KeyEvent.VK_CONTROL);//KeyRelease for KeyPress i.e VK_CONTROL
}
}
