import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Bot {

  public Bot() {
    Random rand = new Random();
    try {
      Robot robot = new Robot();
      int x = rand.nextInt(85);

      if(x == 0) {
        robot.keyPress(KeyEvent.VK_UP);
      } else if (x == 1) {
        robot.keyPress(KeyEvent.VK_LEFT);
      } else if (x == 2) {
        robot.keyPress(KeyEvent.VK_RIGHT);
      }

    } catch (AWTException e) {
        e.printStackTrace();
    }
  }
}
