package com.company;
import java.awt.*;
public class Square extends Rectangle
{
    @Override
    public void paint(Graphics g) {
        g.setColor(randomColor());
        g.fillRect(0, 0,20 , 20);
    }
}
