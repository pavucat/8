package com.company;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;
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
    abstract public void paint(Graphics g);
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
        Random r = new Random();
        int x = 25;
        int a;
        ArrayList<shape> arrayList=new ArrayList<>();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for(int i=0; i<20; i++)
        {
           a=r.nextInt(4);
           if(a==0) arrayList.add(new rectangle());
           if(a==1) arrayList.add(new circle());
           if(a==2) arrayList.add(new square());
           if(a==3) arrayList.add(new oval());
        }
        for(int i=0; i<10; i++) {
            arrayList.get(i).setBounds(x, 0, 50, 50);
            add(arrayList.get(i));
            x+=25;
        }
        x=0;
        for(int i=10; i<20; i++)
        {
            arrayList.get(i).setBounds(x, 40, 50, 50);
            add(arrayList.get(i));
            x+=25;
        }
        //arrayList.get(1).setBounds(20, 10, 50, 50);
        //add(arrayList.get(1));
        setSize(280, 250);
        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new Main();
    }
}
