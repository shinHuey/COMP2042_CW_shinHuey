package test;

//import jdk.nashorn.internal.runtime.Source;

import javax.imageio.ImageIO;
import javax.swing.*;
//import javax.swing.*;
//import javax.xml.transform.Source;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MenuBackground {
    private static ImageIcon image;
   // public  ImageIcon image;
    // The Image to store the background image in.
    //public BufferedImage image;
    public static ImageIcon BackgroundPanel()
    {

            image =new ImageIcon("Source/bg.jpg");

       return image;
    }


}
