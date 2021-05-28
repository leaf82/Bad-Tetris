package Tetris_Shapes;

import javax.swing.*;
import java.awt.*;

public class BackL{
    public BackL(int x, int y, Graphics g) {
        
    }

    public static void draw(int x, int y, Graphics g){
        g.fillRect(x - 30, y, 30, 30); // top left
        g.fillRect(x - 30, y + 30, 30, 30); // bottom left
        g.fillRect(x, y + 30, 30, 30); // middle
        g.fillRect(x + 30, y + 30, 30, 30); // right  
    }
}
