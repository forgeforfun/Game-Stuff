package Platformer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Screen extends JPanel implements Runnable, KeyListener{
    private GameStateManager manager;


    private Thread thread;

    private int FPS = 60;

    private long targetTime = FPS / 1000;

    private boolean isRunning = false;
    public Screen (JFrame frame)
    {
        thread = new Thread(this);
        thread.start();

    }

    @Override
    public void run()
    {
        isRunning = true;
        long start,elapsed,wait;
        manager = new GameStateManager();

        while(isRunning)
        {
            start = System.nanoTime();
            repaint();
            tick();
            elapsed = System.nanoTime() - start;

            wait = targetTime - elapsed/1000000;
            if(wait <= 0)
            {
                wait = 5;
            }

            try
            {
                thread.sleep(wait);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    public void tick()
    {
        manager.tick();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.clearRect(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        manager.draw(g);
    }
    @Override
    public void keyTyped(KeyEvent e)
    {
        
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
        {
            System.exit(0);
        }
        manager.keyPressed(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e)
    {

    }
}
