package game2d.internal;

import game2d.GamePanel;

import javax.swing.*;
import java.awt.*;

/**
 * A class which extends JFrame, used to hide implementation-details
 * so the implementation of JFrame doesn't leak out in Game2D
 *
 * @version 1.0.0
 */
public class InternalGameFrame extends JFrame {
    private InternalGamePanel panel;

    /**
     * creates an InternalGameFrame with default values
     * @param gamePanel to get the internalGamePanel from gamePanel
     */
    public InternalGameFrame(GamePanel gamePanel){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(gamePanel.getInternalPanel());
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * Creates a new InternalGameFrame, setting title as Title of the Frame
     * and adding the InternalGamePanel from GamePanel to the frame
     *
     * @param width the width of the frame
     * @param height the height of the frame
     * @param title the title of the InternalGameFrame
     * @param gamePanel takes the InternalGamePanel from gamePanel
     */
    public InternalGameFrame(int width, int height, String title, GamePanel gamePanel){
        this.panel = gamePanel.getInternalPanel();
        this.setTitle(title);

        this.setFrameSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * provides method to set the frame size
     * @param width the width of the frame
     * @param height the height of the frame
     */
    public void setFrameSize(int width, int height){
        this.setPreferredSize(new Dimension(width, height));
    }
}
