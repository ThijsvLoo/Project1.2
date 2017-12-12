import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;


/**
* This is a very simple bot that randomly decides to rotate the pentomino, shifts it left or right or does nothing.
*/

public class Bot {

  public Bot() {
    Random rand = new Random();
    try {

      /**
      * The Robot object is able to emulate the keyPresses that the user would normally input.
      */
      Robot robot = new Robot();
      /**
      * The keySetter, a random number that was chosen will determine what the program does.
      */
      int keySetter = rand.nextInt(85);

      if(keySetter == 0) {
        robot.keyPress(KeyEvent.VK_UP);
      } else if (keySetter == 1) {
        robot.keyPress(KeyEvent.VK_LEFT);
      } else if (keySetter == 2) {
        robot.keyPress(KeyEvent.VK_RIGHT);
      }

    } catch (AWTException e) {
        e.printStackTrace();
    }
  }
}
