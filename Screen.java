package Platformer;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Elizabeth on 1/5/15.
 */
public class Screen extends JPanel implements Runnable{

    private Thread thread;

    public Screen (JFrame frame)
    {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run()
    {
        while(true)
        {
            revalidate();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.clearRect(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        g.setColor(Constants.backgroundColor);
        g.fillRect(0, 0, Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
    }
}
