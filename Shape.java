import java.awt.*;
import javax.swing.*;

enum blocks {STR, FRTL, BCKL, SQR, FRTZ, BCKZ, TBLK};

public class Shape {
    // private int x;
    // private int y;
    // private int side;
    // private Color color;
    private Graphics g;

    // public Block(int x, int y, int side, Color color, Graphics g) {
    //     this.x = x;
    //     this.y = y;
    //     this.color = color;
    //     this.g = g;
    // }

    // public void drawBlock(Graphics g) {
    //     g.drawRect(x, y, side, side);
    // }

    private int rotation = 0; // count from 0 to 3 for each rotation of the block

    public Shape(blocks block, Graphics g) {
        blocks b = block;
        this.g = g;
        switch(b) {
            case STR:
                System.out.println("Straight");
                break;
            case FRTL:
                System.out.println("Front L");
                break;
            case BCKL:
                System.out.println("Back L");
                break;
            case SQR:
                System.out.println("Square");
                break;
            case FRTZ:
                System.out.println("Front Z");
                break;
            case BCKZ:
                System.out.println("Backwards Z");
                break;
            case TBLK:
                System.out.println("T Block");
                break;
        }
    }

    public void draw(Graphics g) {

    }

    // Helper Methods
    // public boolean canMove() {
        
    // }
}