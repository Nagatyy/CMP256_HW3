package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PixelCheck extends JPanel {
    private static int num = 1;
    @Override
    public void paint(Graphics g) {}
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                JFrame frame = new JFrame("Question 6");
                frame.setSize(500, 300);
                frame.setBackground(Color.blue);
                frame.getContentPane().add(new PixelCheck());
                frame.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent event)
                    {
                        num++;

                        if(num == 1){
                            frame.setBackground(Color.yellow);
                        }
                        else if (num == 2){
                            frame.setBackground(Color.green);
                        }
                        else if (num == 3) {
                            frame.setBackground(Color.red);
                        }
                        else if (num == 4) {
                            frame.setBackground(Color.black);
                        }
                        else if (num == 5) {
                            frame.setBackground(Color.cyan);
                        }
                        else if (num == 6) {
                            frame.setBackground(Color.magenta);
                        }
                        else if (num == 7) {
                            frame.setBackground(Color.blue);
                            num = 1; // to allow cycling
                        }
                    }
                });
                frame.setVisible(true);
                frame.setResizable(false);
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
}