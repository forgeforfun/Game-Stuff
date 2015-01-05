package Platformer;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Elizabeth on 1/5/15.
 */
public class MenuState extends GameState {

    private String[] options = {"start", "help", "quit"};

    int currentSelection = 0;

    public MenuState(GameStateManager gsm) {
        super(gsm);
    }

    @Override
    public void init() {}

    @Override
    public void tick() {}

    @Override
    public void draw(Graphics g)
    {
        g.setColor(new Color(117, 214, 255));
        g.fillRect(0,0,Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);

        for(int i = 0; i < options.length; i ++)
        {
            if(i == currentSelection)
            {
                g.setColor(Color.GREEN);
            } else {
                g.setColor(Color.BLACK);
            }
            g.setFont(new Font("Arial", Font.PLAIN, 72));
            g.drawString(options[i], Main.SCREEN_WIDTH / 2 - 100, 120 + i * 180);
        }
    }

    @Override
    public void keyPressed(int i)
    {
        if(i == KeyEvent.VK_DOWN)
        {
            currentSelection ++;
            if(currentSelection >= options.length) {
                currentSelection = 0;
            }
        }

        if(i == KeyEvent.VK_UP)
        {

                currentSelection--;
             if(currentSelection < 0) {
                currentSelection = options.length-1;
            }
        }

        if(i == KeyEvent.VK_ENTER)
        {
            if(currentSelection == 0)
            {
                //play
            } else if(currentSelection == 1)
            {

            } else if(currentSelection == 2)
            {
                System.exit(0);
            }
        }
    }

    @Override
    public void keyReleased(int i) {

    }
}
