package game2d;

import game2d.internal.InternalGameFrame;

public class GameFrame{
    private InternalGameFrame frame;
    // Constructors
    public GameFrame(){
        this.frame = new InternalGameFrame();
    }
    public GameFrame(int width, int height, String title, GamePanel gamePanel){
        this.frame = new InternalGameFrame(width, height, title, gamePanel);
    }
}
