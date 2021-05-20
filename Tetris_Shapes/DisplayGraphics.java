package Tetris_Shapes;
import javax.swing.*;
import java.awt.*;
public class DisplayGraphics extends  Canvas{

    private static class CoordMath {
        public static int xMath(int fullCoord) {
            return (int)fullCoord/10000;
        }
    
        public static int yMath(int fullCoord) {
            return fullCoord%10000;
        }
    }
    
    /*
    public static void main(String[] args) {  
        JFrame f=new JFrame("Button Example");
        Graphics block;
        blocks.fillRect(130, 30,100, 80);
        f.add(blocks);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
    }  
    */
    
    public void paint(Graphics g) {
        setBackground(Color.decode("#000000"));
        //System.out.println(Color.decode("#000000"));
        g.fillRect(130, 30,100, 80);  
        g.fillRect(230,30,50, 10);  
        setForeground(Color.BLUE);  
        g.fillOval(130,130,50, 60);  
        g.drawArc(30, 200, 40,50,90,60);  
        g.fillArc(30, 130, 40,50,180,40);  
          
    }

    public static void main(String[] args) {  
        DisplayGraphics m=new DisplayGraphics();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        //f.setLayout(null);  
        f.setVisible(true);
        int testCoord = 12001400;
        System.out.println(CoordMath.xMath(testCoord));
        System.out.println(CoordMath.yMath(testCoord));
    }
}
