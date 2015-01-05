package Platformer;

import java.awt.*;

/**
 * Created by Elizabeth on 1/5/15.
 */
public abstract class GameState
{
    protected GameStateManager gsm;

    public GameState(GameStateManager gsm)
    {
        this.gsm = gsm;
        init();
    }

    public abstract void init();
    public abstract void tick();
    public abstract void draw(Graphics g);
    public abstract void keyPressed(int i);
    public abstract void keyReleased(int i);



}
