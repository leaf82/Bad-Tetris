package Tetris_Shapes;

import java.awt.*;
import javax.swing.*;

public class Block {
    //Bottom left corner of block
    private int xCoord;
    private int yCoord;

    //size of block
    private int sideLen = 80;

    //Array for RGB
    private int[] rgbColor = new int[3];

    public Block(int x, int y, int[] rgb) {
        this.xCoord = x;
        this.yCoord = y;
        this.rgbColor = rgb;
    }
}