package game2d;

import game2d.internal.InternalGamePanel;

public class GamePanel {
    private InternalGamePanel panel;

    // Constructor
    public GamePanel() {
        this.panel = new InternalGamePanel();
    }

    public void runGame(){panel.startMyGameThread();}

    public InternalGamePanel getPanel() {
        return panel;
    }
}
