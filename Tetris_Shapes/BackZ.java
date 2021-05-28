package Tetris_Shapes;

import javax.swing.*;
import java.awt.*;

public class BackZ{
    public BackZ(int x, int y, Graphics g) {
        
    }

    public static void draw(int x, int y, Graphics g){
        g.fillRect(x - 30, y , 30, 30); // far upper left
        g.fillRect(x , y , 30, 30); // upper
        g.fillRect(x , y + 30, 30, 30); // lower
        g.fillRect(x + 30, y + 30, 30, 30); // far right lower
    }
}
