package game2d;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Class for handling Input; KeyPress and KeyRelease
 * implements the KeyListener Interface
 * @version 1.0.0
 */
public class KeyHandler implements KeyListener {
    public boolean wPressed, aPressed, sPressed, dPressed;
    /**
     * Method which change the state of the variables w-,a-,s-,dPressed when triggered
     * @param e event that indicates that a keystroke occurred in a component
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W){
            wPressed = true;
        }
        if (key == KeyEvent.VK_S){
            sPressed = true;
        }
        if (key == KeyEvent.VK_A){
            aPressed = true;
        }
        if (key == KeyEvent.VK_D){
            dPressed = true;
        }
    }

    /**
     * Method which change the state of the variables w-,a-,s-,dPressed when triggered
     * @param e event that indicates that a keystroke occurred in a component
     */
    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W){
            wPressed = false;
        }
        if (key == KeyEvent.VK_S){
            sPressed = false;
        }
        if (key == KeyEvent.VK_A){
            aPressed = false;
        }
        if (key == KeyEvent.VK_D){
            dPressed = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
