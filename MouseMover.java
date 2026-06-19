import java.awt.Robot;

import java.awt.MouseInfo;

import java.awt.PointerInfo;
 
public class MouseMover {
 
    public static void main(String[] args) throws Exception {

        Robot robot = new Robot();
 
        System.out.println("Mouse is moving...");

        System.out.println("Close CMD window or press Ctrl+C to stop.");
 
        while (true) {

            PointerInfo pointerInfo = MouseInfo.getPointerInfo();

            int x = pointerInfo.getLocation().x;

            int y = pointerInfo.getLocation().y;
 
            // Slight movement so system detects activity

            robot.mouseMove(x + 1, y + 1);
 
            Thread.sleep(100); // 0.1 second delay

        }

    }

}
 