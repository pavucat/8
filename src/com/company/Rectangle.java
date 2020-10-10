package com.company;
import java.awt.*;
public class Rectangle extends Shape
{
    @Override
    public void paint(Graphics g) {
        g.setColor(randomColor());
        g.fillRect(0, 0,20 , 30);
    }
}
