package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class Shape extends JComponent
{
    Random r = new Random();
    static final long serialVersionUID=1L;
    Color color;
    public Color randomColor()
    {
        int a;
        a=r.nextInt(6);
        if(a==1)
            return Color.red;
        if (a==2)
            return Color.BLACK;
        if(a==3)
            return Color.BLUE;
        if(a==4)
            return Color.CYAN;
        if(a==5)
            return Color.DARK_GRAY;
        if(a==6)
            return Color.GREEN;
        return Color.GREEN;
    }
    Shape()
    {
        this.color=randomColor();
    }
    abstract public void paint(Graphics g);
}
