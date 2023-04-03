/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Lesson Learned: I learned how to draw with java, this draws a TV
 * Class: 115-01
 * Date: 28-MAR-2023
 * Assignment: 13a
 * 
 */



package week12;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.*;
import java.awt.geom.*;

public class TV extends LandscapeObject {
    // Attributes
    private int width;
    private int height;

    // Constructor
    public TV(Graphics2D g2, int x, int y, int width, int height, double scale) {
        super(g2, x, y, scale);
        this.width = (int) (width * scale);
        this.height = (int) (height * scale);
    }

    @Override
    public void draw() {
        drawScreen();
        drawFrame();
        drawStand();
    }

    private void drawScreen() {
        Color previousColor = g2.getColor();
        g2.setColor(Color.BLACK);
        g2.fillRect(currentX, currentY, width, height);
        g2.setColor(previousColor);
    }

    private void drawFrame() {
        BasicStroke previousStroke = (BasicStroke) g2.getStroke();
        Color previousColor = g2.getColor();
        g2.setStroke(new BasicStroke((float) (2 * super.getScale())));
        g2.setColor(Color.DARK_GRAY);
        g2.drawRect(currentX, currentY, width, height);
        g2.setStroke(previousStroke);
        g2.setColor(previousColor);
    }

    private void drawStand() {
        BasicStroke previousStroke = (BasicStroke) g2.getStroke();
        Color previousColor = g2.getColor();
        g2.setStroke(new BasicStroke((float) (4 * super.getScale())));
        g2.setColor(Color.WHITE);
        int standWidth = (int) (width * 0.5);
        int standHeight = (int) (height * 0.15);
        int standX = currentX + ((width - standWidth) / 2);
        int standY = currentY + height;

    }

    @Override
    public void applyScale() {
        this.width = (int) (width * super.getScale());
        this.height = (int) (height * super.getScale());
    }
}