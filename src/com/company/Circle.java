package com.company;

import java.awt.*;

public class Circle extends Oval
{
    public void paint(Graphics g) {
        g.setColor(randomColor());
        g.fillOval(0, 0,20, 20);
    }
}
