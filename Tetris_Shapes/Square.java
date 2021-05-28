package Tetris_Shapes;

import javax.swing.*;
import java.awt.*;

public class Square{
    public Square(int x, int y, Graphics g) {
        
    }

    public static void draw(int x, int y, Graphics g){
        g.fillRect(x , y, 30, 30);
        g.fillRect(x + 30, y, 30, 30);
        g.fillRect(x , y + 30, 30, 30);
        g.fillRect(x + 30, y + 30, 30, 30);
    }
}
