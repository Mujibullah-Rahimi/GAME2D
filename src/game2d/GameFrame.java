package game2d;

import game2d.internal.InternalGameFrame;

/**
 * Provides a class which can create a gameFrame which needs a gamePanel
 * @version 1.0.0
 */
public class GameFrame{
    private InternalGameFrame frame;

    /**
     *Creates an InternalGameFrame with the parameters taken in for the GameFrame constructor
     * @param gamePanel the gamePanel which InternalGameFrame takes its internalGamePanel
     */
    public GameFrame(GamePanel gamePanel){
        this.frame = new InternalGameFrame(gamePanel);
    }

    /**
     * Creates an InternalGameFrame with the parameters taken in for the GameFrame constructor
     * @param width the width of the frame
     * @param height the height of the frame
     * @param title the title which is shown in the frame
     * @param gamePanel the gamePanel which InternalGameFrame takes its internalGamePanel
     */
    public GameFrame(int width, int height, String title, GamePanel gamePanel){
        this.frame = new InternalGameFrame(width, height, title, gamePanel);
    }
}
