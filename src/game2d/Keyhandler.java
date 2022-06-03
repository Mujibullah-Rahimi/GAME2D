package game2d;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyhandler implements KeyListener {
    public boolean wPressed, aPressed, sPressed, dPressed;
    @Override
    public void keyTyped(KeyEvent e) {

    }

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
}
