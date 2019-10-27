package com.company;

import java.awt.*;
import java.awt.font.*;
import javax.swing.*;

public class FeelingGroovy extends JComponent
{
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        // setting the font and text
        Font f = new Font("Comic Sans MS", Font.BOLD, 44);
        String textString = "Feeling Groovy!";
        g2d.setFont(f);
        g2d.setColor(Color.magenta);


        g2d.translate(getWidth()/2, getHeight()/2);
        g2d.shear(0.8, 0); // to italicize
        FontMetrics fM = g2d.getFontMetrics();
        g2d.drawString(textString, -fM.stringWidth(textString)/2, fM.getHeight()/2);


        FontRenderContext renderContext = g2d.getFontRenderContext();
        // to draw the line
        g2d.setColor(Color.green);
        g2d.setStroke(new BasicStroke(3));
        g2d.drawLine(-fM.stringWidth(textString)/2, fM.getHeight()/2, -fM.stringWidth(textString)/2 + (int)f.getStringBounds(textString, renderContext).getWidth(), fM.getHeight()/2);
    }
    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run()
            {
                JFrame f = new JFrame("Shearing Word Demo");
                f.setSize(500, 250);
                f.getContentPane().add(new FeelingGroovy());
                f.setVisible(true);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}
