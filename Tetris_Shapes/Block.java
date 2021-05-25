package Tetris_Shapes;

import java.awt.*;
import javax.swing.*;

public class Block {
    private int x;
    private int y;
    private Color color;
    private Graphics g;

    public Block(int x, int y, Color color, Graphics g) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.g = g;
    }


}