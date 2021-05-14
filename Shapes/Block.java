package Shapes;

import java.awt.*;
import javax.swing.*;

public class Block {
    private int xCoord;
    private int yCoord;
    private int[] rgbColor = new int[3];

    public Block(int x, int y, int[] rgb) {
        this.xCoord = x;
        this.yCoord = y;
        this.rgbColor = rgb;
    }
}