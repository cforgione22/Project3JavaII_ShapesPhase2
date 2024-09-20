package org.example;

import java.awt.*;

/**
 *  Box child class
 */


public class Box extends Shape {

    public Box(Point p1, Point p2, Color color) {
        super(p1, p2, color);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g; //casting for enhanced 2D graphics capability
        int height = Math.abs(getP1().y - getP2().y);
        int width = Math.abs(getP1().x - getP2().x);
        g2.setStroke(new BasicStroke(getLineWidth()));
        g2.setColor(getColor());
        g2.drawRect(getP1().x, getP1().y, width, height);
    }

}