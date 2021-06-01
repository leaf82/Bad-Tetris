import javax.swing.*;
import java.awt.*;

public class Grid {
    public static void draw(int x, int y, int size, Graphics g) {
        g.drawRect(x, y, size, size);
    }

    
    public static void drawLine(int x, int y, Graphics g){
        g.fillRect(x + 30, y, 30, 30);
        g.fillRect(x + 60, y, 30, 30);
        g.fillRect(x + 90, y, 30, 30);
        g.fillRect(x + 120, y, 30, 30);
    }
}
