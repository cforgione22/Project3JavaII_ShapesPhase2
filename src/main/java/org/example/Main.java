package org.example;
import org.example.PictureFrame;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new PictureFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}