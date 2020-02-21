package com.ahmiao;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * @author AhmiaoChen
 * 游戏工具类
 */
public class GameUnitil {
    //工具类最好将构造器私有化
    private GameUnitil(){
    }
    //获取图片
    public static Image getImage(String path){
        BufferedImage bi=null;
        try {
            URL url=GameUnitil.class.getClassLoader().getResource(path);
            bi= ImageIO.read(url);
        }catch (IOException e){
            e.printStackTrace();
        }
        return bi;
    }
}
