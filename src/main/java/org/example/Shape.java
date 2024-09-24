package org.example;

import java.awt.*;
/**
 *  abstract parent class
 */

public abstract class Shape {

    private Point p1;
    private Point p2;
    private Color color;
    private int lineWidth = 2;
    public Shape( )
    {
        p1 = new Point(0,0);
        p2 = new Point(0,0);
        color = Color.BLUE;
    }

    public Shape(Point p1, Color c)
    {
        setP1(p1);
        setColor(c);
    }

    public Shape(Point p1, Point p2, Color c)
    {
        setP1(p1);
        setP2(p2);
        setColor(c);
    }

    public void setP1(Point p1)
    {
        this.p1 = p1;
    }


    public Point getP1 ()
    {
        return p1;
    }

    public void setP2(Point p2)
    {
        this.p2 = p2;
    }

    public Point getP2 ()
    {
        return p2;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public Color getColor()
    {
        return color;
    }

    public int getLineWidth() {
        return lineWidth;
    }

    public void setLineWidth(int lineWidth) {
        this.lineWidth = lineWidth;
    }

    public abstract void paint(Graphics g);

    public abstract void draw(Graphics g);


}



