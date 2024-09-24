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
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g; //casting for enhanced 2D graphics capability
        g2.setStroke(new BasicStroke(getLineWidth()));
        g2.setColor(getColor());

        Point point3 = new Point(getP1().x, getP2().y);
        Point point4 = new Point(getP2().x, getP1().y);

        int[] xs = { getP1().x, point3.x, getP2().x, point4.x };
        int[] ys = { getP1().y, point3.y, getP2().y, point4.y };

        g2.drawPolygon(xs, ys, 4);
    }

    @Override
    public void paint(Graphics g) {

    }

}