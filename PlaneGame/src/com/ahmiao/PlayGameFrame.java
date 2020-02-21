package com.ahmiao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 飞机大战的主窗口
 * @author AhmiaoChen
 */
public class PlayGameFrame extends JFrame {
    Image bg=GameUtil.getImage("images/plane.png");
    /**
     * 初始化窗口
     */
    public void launchFrame(){
        //设窗口的一些属性
        this.setTitle("Ahmiao'Game");
        this.setVisible(true);
        this.setSize(500,500);
        this.setLocation(300,300);
        //增加关闭事件
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    /**
     * 窗口的绘制
     * @param g
     */
    @Override
    public void paint(Graphics g){//自动被调用。g相当一只画笔
        super.paint(g);
        g.setColor(Color.red);
        g.drawLine(100,100,300,300);
        g.draw3DRect(100,100,300,300,false);
        g.drawString("AhmiaoChen",100,100);
        g.drawImage(bg,250,250,null);
    }
}
