package com.company;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

abstract class shape extends JComponent
{
    Random r = new Random();
    public Color randomcolor()
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
    static final long serialVersionUID=1L;
    Color color;
    shape()
    {
        this.color=randomcolor();
    }
    public void paint(Graphics g){}

}
class rectangle extends shape
{
    rectangle()
    {
        super();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(randomcolor());
        g.fillRect(0, 0,20 , 30);
    }
}
class square extends rectangle
{
    square()
    {
        super();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(randomcolor());
        g.fillRect(0, 0,20 , 20);
    }
}
class oval extends  shape
{
    Random r = new Random();
    oval() {
        super();
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(randomcolor());
        g.fillOval(0, 0,20, 30);
    }
}
class circle extends oval
{
    circle()
    {
        super();
    }
    public void paint(Graphics g) {
        g.setColor(randomcolor());
        g.fillOval(0, 0,20, 20);
    }
}
public class Main extends JFrame {
    public Main() {
        super("Figuri");
        int x1=0;
        int x2=0;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        rectangle one = new rectangle();
        oval two = new oval();
        two.setBounds(50, 50, 120, 120);
        lp.add(one, JLayeredPane.POPUP_LAYER);
        lp.add(two, JLayeredPane.POPUP_LAYER);
        setSize(280, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Main();
    }
}
