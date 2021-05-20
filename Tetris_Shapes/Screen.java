package Tetris_Shapes;
import javax.swing.*;
import java.awt.*;
public class Screen extends  JPanel{    
    public void paint(Graphics g) {    
        setBackground(Color.GRAY);
        final int spacer = 30;
        for(int i = getHeight()/2 - (spacer * 10); i < getHeight()/2 + (spacer * 10); i += spacer)
        {
            for(int x = getWidth()/2 - (spacer * 5); x < getWidth()/2 + (spacer * 5); x += (spacer))
            {
                g.drawRect(x, i, (spacer), (spacer));
            }
        }
        
        setForeground(Color.black);
    }
    //10x20
    public static void main(String[] args) {
        Screen m=new Screen();
        JFrame f=new JFrame();
        f.add(m);
        final int side = 800;
        f.setSize(800, 800);
        f.setVisible(true);
    }
}
