package Tetris_Shapes;

import java.awt.*;
import javax.swing.*;

public class Block {
    //Bottom left corner of block
    private int xCoord;
    private int yCoord;

    private final int sideLen = 80; //size of block TBD
    private String color; //in the format for Color.decode i.e. #000000 for black

    public Block(int x, int y, String color) {
        this.xCoord = x;
        this.yCoord = y;
        this.color = color;
    }

    public int getXCoord() {
        return this.xCoord;
    }

    public int getYCoord() {
        return this.yCoord;
    }

    // move the block along X axis
    public boolean setX(int newX) {
        boolean test = true;
        if (test/*can move*/) {
            //move block
            this.xCoord = newX;
            return true;
        } else {
            return false;
        }
    }

    // move the block along Y axis
    public boolean setY(int newY) {
        boolean test = true;
        if (test/*can move*/) {
            //move block
            this.yCoord = newY;
            return true;
        } else {
            return false;
        }
    }
}