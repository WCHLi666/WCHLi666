package com.hspedu.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class DrawCircle extends JFrame {
    //定义一个面板
    public MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
        System.out.println("退出程序~");
    }
    public DrawCircle() {//构造器
//初始化面板
        mp = new MyPanel();
//把面板放入到窗口(画框)
        this.add(mp);
//设置窗口的大小
        this.setSize(400, 300);
//当点击窗口的小×，程序完全退出.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}


public class BallMove extends JFrame{
    MyPanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(400,300);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}



class MyPanel extends JPanel implements KeyListener {
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        System.out.println((char)e.getKeyChar() + "被按下。。");
        if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            y++;
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}