package Platformer;

import java.awt.*;
import java.util.Stack;


public class GameStateManager
{
    private Stack<GameState> states;

    public GameStateManager ()
    {
        states = new Stack<GameState>();
        states.push(new MenuState(this));
    }

    public void tick()
    {
        states.peek().tick();
    }

    public void draw(Graphics g)
    {
        states.peek().draw(g);
    }

    public void keyPressed(int i)
    {
        states.peek().keyPressed(i);
    }

    public void keyReleased(int i)
    {
        states.peek().keyReleased(i);
    }



}
