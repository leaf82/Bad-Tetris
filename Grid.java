import javax.swing.*;
import java.awt.*;

public class Grid {
    public static void draw(int x, int y, int size, Graphics g) {
        g.drawRect(x, y, size, size);
    }
}
