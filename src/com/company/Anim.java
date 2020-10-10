package com.company;
import javax.swing.*;
import java.awt.*;

public class Anim {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame f = new JFrame();
                JLabel l = new JLabel();
                f.setSize(500, 500);
                Image img = Toolkit.getDefaultToolkit().createImage("C:/Users/Saint/IdeaProjects/8/2.gif");
                ImageIcon icon = new ImageIcon(img);
                icon.setImageObserver(l);
                l.setIcon(icon);
                f.add(l);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setVisible(true);
            }
        });

    }
}
