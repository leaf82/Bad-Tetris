package Tetris_Shapes;
import javax.swing.*;
import java.awt.*;
public class Screen extends  JPanel{    
    public void paint(Graphics g) {    
        setBackground(Color.GRAY);

        g.fillRect(100, 100, 100, 100);
        setForeground(Color.BLUE);
    }
    //10x20
    public static void main(String[] args) {
        Screen m=new Screen();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(400,400);
        f.setVisible(true);
    }
}
