package org.example;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


//JFrame is a java swing canvas

public class PictureFrame extends JFrame {

    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 800;
    private Point upperLeft = new Point(300, 10);   //default anchor point

    private CanvasComponent scene;      //the widget where the drawings reside
    private JPanel panel;               //the subWindow (subframe) where the scene lives

    /**
     * Using this inner class to bundle the mouse events (listening, handling)
     */
    class MyMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            scene.createShape(e.getPoint());
        }


        @Override
        public void mouseDragged(MouseEvent e) {
            scene.drawShape(e.getPoint());
        }
    }

    /**
     * Using this inner class to bundle the key events (listening, handling)
     * so that the drawing configuration can be established.
     */
    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            scene.processKeys(e.getKeyChar());
        }
    }

    /**
     * This default constructor established the appropriate user menus, drawing widgets, and events
     */
    public PictureFrame() {
        scene = new CanvasComponent();
        MouseAdapter listener = new MyMouseListener();
        scene.addMouseListener(listener);
        scene.addMouseMotionListener(listener);

        KeyAdapter keyListener = new MyKeyListener();
        scene.addKeyListener(keyListener);
        scene.setFocusable(true);

        /**
         * Display the keystroke options to the user.
         */
        JLabel keyGuide = new JLabel();
        keyGuide.setText("(E)rase (T)rails (L)ine (B)ox (O)val (C)olor");
        keyGuide.setFont(new Font("SansSerif", Font.PLAIN, 24));
        keyGuide.setHorizontalAlignment(SwingConstants.CENTER);

        /**
         * Display the menuing widgets to the user
         */
        panel = new JPanel();
        panel.setLayout(new BorderLayout()); //Five sections: N, S, E, W, Center
        panel.add(keyGuide, BorderLayout.SOUTH);
        panel.add(scene, BorderLayout.CENTER);

        add(panel);  //Add the panel to the window (frame) - as java calls it
        setTitle("Simple Drawing");

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(upperLeft);
    }
}
