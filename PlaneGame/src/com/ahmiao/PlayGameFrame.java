package com.ahmiao;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 飞机大战的主窗口
 * @author AhmiaoChen
 */
public class PlayGameFrame extends JFrame {
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
}
