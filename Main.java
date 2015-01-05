package Platformer;

import javax.swing.*;

/**
 * Created by Elizabeth on 1/5/15.
 */
public class Main {
    public static final String TITLE = "The Homie Platformer";

    public static final int SCREEN_WIDTH = 1280;
    public static final int SCREEN_HEIGHT = 720;

    public static void main(String[] args)
    {
        new Main();
    }

    private Main()
    {
        JFrame frame = new JFrame(TITLE);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        Screen screen = new Screen(frame);
        frame.add(screen);
    }





}
