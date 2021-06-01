import javax.swing.*;

import Tetris_Shapes.*;

import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends  JPanel implements ActionListener{
    private final int spacer = 30;
    Timer time = new Timer(1000, this); 
    int y = 0, yVel = 30; // Starting value and the amount its increased
    int ran = 0;

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        y += yVel;
        
        repaint();
    }

    public void paintComponent(Graphics g) {   
        super.paintComponent(g); // Properly refreshes
        setBackground(Color.GRAY); // Background color
        

        //Prints a grid for the blocks to move across
        for(int y = getHeight()/2 - (spacer * 10); y < getHeight()/2 + (spacer * 10); y += spacer)
        {
            for(int x = getWidth()/2 - (spacer * 5); x < getWidth()/2 + (spacer * 5); x += (spacer))
            {
                Grid.draw(x, y, spacer, g);
            }
        }

        /* Making a line piece using a var for the y value
           to allow it to be redrawn and moved
        
        g.fillRect(getWidth()/2 - (spacer * 5), getHeight()/2 - (spacer * 10) + y, spacer, spacer);
        g.fillRect(getWidth()/2 - (spacer * 5), getHeight()/2 - (spacer * 10) + y, spacer * 2, spacer);
        g.fillRect(getWidth()/2 - (spacer * 5), getHeight()/2 - (spacer * 10) + y, spacer * 3, spacer);
        g.fillRect(getWidth()/2 - (spacer * 5), getHeight()/2 - (spacer * 10) + y, spacer * 4, spacer);
        */

        // Looks to see if the timer if running before getting a piece 
        if (!time.isRunning()) {
            ran = (int)(Math.random() * (6));
        } 
            
        // All of the different classes using their draw methods
        if (ran == 0){
            Straight.draw(getWidth()/2 - (spacer), getHeight()/2 - (spacer * 10) + y, g);
        } else if (ran == 1){
            Tblock.draw(getWidth()/2 - spacer, getHeight()/2 - (spacer * 10) + y, g);
        } else if (ran == 2){
            Square.draw(getWidth()/2 - spacer, getHeight()/2 - (spacer * 10) + y, g);
        } else if (ran == 3){
            FrontZ.draw(getWidth()/2 - spacer, getHeight()/2 - (spacer * 10) + y, g);
        } else if (ran == 4){
            FrontL.draw(getWidth()/2 - spacer, getHeight()/2 - (spacer * 10) + y, g);
        } else if (ran == 5){
            BackZ.draw(getWidth()/2 - spacer, getHeight()/2 - (spacer * 10) + y, g);
        } else {
            BackL.draw(getWidth()/2 - spacer, getHeight()/2 - (spacer * 10) + y, g);
        }
            
        setForeground(Color.black); // Color of things drawn

        // Starts the timer causing the blocks to fall
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
        int side = 800;
        f.add(m);
        f.setSize(side, side);
        f.setVisible(true);

    }
}
