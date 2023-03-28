/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Lesson Learned: I learned how to draw with java, this draws a car
 * Class: 115-01
 * Date: 28-MAR-2023
 * Assignment: 13a
 * 
 */

package week12;


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Car extends LandscapeObject {
    private Color bodyColor;
    private Color wheelColor;
    private int width;
    private int height;
    private int wheelDiameter;
    
    public Car(Graphics2D g2, int x, int y, double scale, Color bodyColor, Color wheelColor, int width, int height, int wheelDiameter) {
        super(g2, x, y, scale);
        this.bodyColor = bodyColor;
        this.wheelColor = wheelColor;
        this.width = width;
        this.height = height;
        this.wheelDiameter = wheelDiameter;
    }
    
    @Override
    public void draw() {
        g2.setColor(bodyColor);
        Rectangle2D.Double body = new Rectangle2D.Double(currentX, currentY, width * this.getScale(), height * this.getScale());
        g2.fill(body);
        
        g2.setColor(wheelColor);
        int wheelX = currentX + (int)(width * 0.1 * this.getScale());
        int wheelY = currentY + (int)(height * 0.8 * this.getScale());
        g2.fillOval(wheelX, wheelY, wheelDiameter * (int)this.getScale(), wheelDiameter * (int)this.getScale());
        wheelX = currentX + (int)(width * 0.7 * this.getScale());
        g2.fillOval(wheelX, wheelY, wheelDiameter * (int)this.getScale(), wheelDiameter * (int)this.getScale());
    }
    
    @Override
    public void applyScale() {
        // Apply scaling to the width, height and wheel diameter of the car
        this.width = (int)(this.width * this.getScale());
        this.height = (int)(this.height * this.getScale());
        this.wheelDiameter = (int)(this.wheelDiameter * this.getScale());
    }
}