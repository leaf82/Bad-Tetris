package Tetris_Shapes;

import javax.swing.*;
import java.awt.*;

public class FrontZ{
    public FrontZ(int x, int y,Graphics g) {
        
    }

    public static void draw(int x, int y, Graphics g){
        g.fillRect(x - 30, y, 30, 30); // top left
        g.fillRect(x , y, 30, 30); // top middle
        g.fillRect(x + 30, y + 30, 30, 30); // bottom middle
        g.fillRect(x , y + 30, 30, 30); // bottom right
    }
}
