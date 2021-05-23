package Tetris_Shapes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends  JPanel implements ActionListener{
    private final int spacer = 30;
    Timer time = new Timer(5, this);
    int y = 0, yVel = 2;

    public int getSpacer()
    {
        return spacer;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        y += yVel;
        
        repaint();
    }

    public void paint(Graphics g) {    
        setBackground(Color.GRAY);
        for(int i = getHeight()/2 - (spacer * 10); i < getHeight()/2 + (spacer * 10); i += spacer)
        {
            for(int x = getWidth()/2 - (spacer * 5); x < getWidth()/2 + (spacer * 5); x += (spacer))
            {
                g.drawRect(x, i, (spacer), (spacer));
            }
        }
        g.fillRect(getWidth()/2 - (spacer * 5), getHeight()/2 - (spacer * 10) + y, spacer, spacer);
        setForeground(Color.black);

        if(y + getHeight()/2 - (spacer * 10) == (getHeight()/2 + (spacer * 10)) - 30)
        {
            time.stop();
        } else {
            time.start();
        }
        
    }
    //10x20
    public static void main(String[] args) {
        Screen m=new Screen();
        JFrame f=new JFrame();
        f.add(m);
        final int side = 800;
        f.setSize(side, side);
        f.setVisible(true);
    }
}
