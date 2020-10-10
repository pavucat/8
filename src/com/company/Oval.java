package com.company;
import java.awt.*;
import java.util.Random;
public class Oval extends Shape
{
    Random r = new Random();
    @Override
    public void paint(Graphics g) {
        g.setColor(randomColor());
        g.fillOval(0, 0,20, 30);
    }
}
