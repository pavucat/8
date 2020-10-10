package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.Image;

public class Kartinka extends JPanel {
    static Image img = new ImageIcon(" ").getImage();
public static void main(String[] args) {
    args = new String[1];
    args[0] = "C:/Users/Saint/IdeaProjects/8/c7883ac51fa20bd1c1b700b0d2aa8fe6.jpg";
    img = new ImageIcon(args[0]).getImage();
    JFrame one = new JFrame();
    one.setSize(500, 500);
    one.setLayout(null);
    Kartinka two= new Kartinka();
    two.setBounds(0, 0, 500, 500);
    one.add(two);
    one.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    one.setVisible(true);
}
public void paintComponent(Graphics g)
{
    g.drawImage(img, 0, 0, null);
}
}