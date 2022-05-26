package game2d;

import game2d.internal.InternalGameFrame;

import javax.swing.*;

public class GameFrame extends JFrame {
    private InternalGameFrame frame;


    public GameFrame(){
        this.frame = new InternalGameFrame();
    }

    public GameFrame(int width, int height){
        this.frame = new InternalGameFrame(width, height);
    }

}
