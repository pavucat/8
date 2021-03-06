package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class Main extends JFrame {
    ArrayList<Shape> arrayList=new ArrayList<>();
    int x = 25;
    public Main() {
        super("Figuri");
        Random r = new Random();
        int a;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        for(int i=0; i<20; i++)
        {
           a=r.nextInt(4);
           if(a==0) arrayList.add(new Rectangle());
           if(a==1) arrayList.add(new Circle());
           if(a==2) arrayList.add(new Square());
           if(a==3) arrayList.add(new Oval());
        }
        JButton one = new JButton();
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                one.setVisible(false);
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
            }
        });
        add(one);
        setSize(280, 250);
        setVisible(true);
    }
    public static void main(String[] args) {

        JFrame.setDefaultLookAndFeelDecorated(true);
        new Main();
    }

}
