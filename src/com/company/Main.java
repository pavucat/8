package com.company;
import java.awt.*;
import java.util.Random;
import javax.swing.*;

class shape extends JComponent
{
    static final long serialVersionUID=1L;
    Color color;
    shape(Color color)
    {
        this.color=color;
    }
    public void paint(Graphics g){}
}
class rectangle extends shape
{
    Random r = new Random();
    rectangle(Color color)
    {
        super(color);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(0, 0,r.nextInt(50) , r.nextInt(50));
    }
}
class circle extends  shape
{
    Random r = new Random();
    circle(Color color) {
        super(color);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(50, 50, r.nextInt(50), r.nextInt(50));
    }
}
public class Main extends JFrame {
    public Main() {
        super("Figuri");
        int x1=0;
        int x2=0;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        rectangle one = new rectangle(Color.red);
        circle two = new circle(Color.red);
        one.setBounds(10, 40, 120, 120);
        two.setBounds(60, 120, 160, 180);
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
