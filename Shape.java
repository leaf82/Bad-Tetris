import java.awt.*;
import javax.swing.*;

public class Shape {
    // private int x;
    // private int y;
    // private int side;
    // private Color color;
    // private Graphics g;

    // public Block(int x, int y, int side, Color color, Graphics g) {
    //     this.x = x;
    //     this.y = y;
    //     this.color = color;
    //     this.g = g;
    // }

    // public void drawBlock(Graphics g) {
    //     g.drawRect(x, y, side, side);
    // }

    private enum blocks {straight, frontL, backL, square, BackZ, frontZ, tBlock};
    private int rotation = 0; // count from 0 to 3 for each rotation of the block

    public Shape(String block, Grpahics g) {
        
    }

    public void draw(Graphics g) {

    }

    // Helper Methods
    // public boolean canMove() {
        
    // }
}