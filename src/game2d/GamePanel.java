package game2d;

import game2d.internal.InternalGamePanel;

/**
 * Provides a class which user can create a GamePanel, which contains run method (runGame())
 * @version 1.0.0
 */
public class GamePanel {
    private InternalGamePanel panel;

    /**
     * Creating a GamePanel which creates an InternalGamePanel which is a subclass of JPanel
     */
    public GamePanel() {
        this.panel = new InternalGamePanel();
    }

    /**
     * method calling the startMyGameThread from the InternalGamePanel class
     * to start a game-loop
     */
    public void runGame(){panel.startMyGameThread();}

    /**
     * A getter to get the InternalGamePanel when a GamePanel is created
     * @return the InternalGamePanel
     */
    public InternalGamePanel getInternalPanel() {
        return panel;
    }
}
