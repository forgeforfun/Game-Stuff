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
        System.out.println("SUCCESS!");
    }


}
