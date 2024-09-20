package org.example;

import java.awt.*;

/**
 *  Box child class
 */


public class Oval extends Shape {

    public Oval(Point p1, Point p2, Color color) {
        super(p1, p2, color);
    }

    @Override
    public void paint(Graphics g) {
        int height = Math.abs(getP1().y - getP2().y);
        int width = Math.abs(getP1().x - getP2().x);

        Graphics2D g2 = (Graphics2D) g; //casting for enhanced 2D graphics capability
        g2.setStroke(new BasicStroke(getLineWidth()));
        g2.setColor(getColor());
        g2.drawOval(getP1().x, getP1().y, width, height);

    }
}