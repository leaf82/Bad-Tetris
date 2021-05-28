package Tetris_Shapes;

import javax.swing.*;
import java.awt.*;

public class Straight{

    public Straight(int x, int y, Graphics g) {

    }
    
    public static void draw(int x, int y, Graphics g){
        g.fillRect(x - 30, y, 30, 30); //far left
        g.fillRect(x , y, 30, 30); // left
        g.fillRect(x + 30, y, 30, 30); //right
        g.fillRect(x + 60, y, 30, 30); //far right
    }
}

