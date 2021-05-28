package Tetris_Shapes;

import javax.swing.*;
import java.awt.*;

public class FrontL{
    public FrontL(int x, int y, Graphics g) {
        
    }

    public static void draw(int x, int y, Graphics g){
        g.fillRect(x - 30, y + 30, 30, 30); // left
        g.fillRect(x , y + 30, 30, 30); // middle
        g.fillRect(x + 30, y + 30, 30, 30); // bottom right
        g.fillRect(x  + 30, y, 30, 30); // top right
    }
}
