package org.example;

import java.awt.*;

/**
 *  line child class
 */

public class Line extends Shape {

    public Line(Point p1, Point p2, Color color) {
        super(p1, p2, color);
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g; //casting for enhanced 2D graphics capability
        g2.setStroke(new BasicStroke(getLineWidth()));
        g2.setColor(getColor());
        g2.drawLine(getP1().x, getP1().y, getP2().x, getP2().y);
    }

    @Override
    public void paint(Graphics g) {
    }

}