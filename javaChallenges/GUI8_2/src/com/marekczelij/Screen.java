package com.marekczelij;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Screen extends JPanel {
    private double x = 100;
    private double y = 100;
    private double width = x + 200;
    private double height = y + 50;

    public Screen(double x, double y, double width, double height) throws HeadlessException {
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

    @Override
    public void paintComponent(Graphics g) {
//        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g;
//        g2.setColor(Color.RED);

        g2.setColor(Color.BLUE);
//         Draw the blue rectangle
        g2.draw(new Rectangle2D.Double(x, y, width, height));
    }
}
