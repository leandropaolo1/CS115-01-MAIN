/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Lesson Learned: I learned how to draw with java, this draws a flower
 * Class: 115-01
 * Date: 28-MAR-2023
 * Assignment: 13a
 * 
 */

package week12;

import java.awt.*;
import java.awt.geom.*;

public class Flower extends LandscapeObject {
    // Attributes
    private int petalSize;  // The size of each petal
    private int stemLength; // The length of the stem
    
    public Flower(Graphics2D g2, int x, int y, double scale, int petalSize, int stemLength) {
        super(g2, x, y, scale);
        this.petalSize = (int) (petalSize * scale);
        this.stemLength = (int) (stemLength * scale);
    }
    
    @Override
    public void draw() {
        drawStem();
        drawPetal(0);
        drawPetal(72);
        drawPetal(144);
        drawPetal(216);
        drawPetal(288);
        drawCenter();
    }
    
    @Override
    public void applyScale() {
        
    }
    
    private void drawStem() {
        g2.setStroke(new BasicStroke(2));
        g2.setColor(Color.GREEN.darker());
        g2.drawLine(currentX, currentY, currentX, currentY + stemLength);
    }
    
    private void drawPetal(int angle) {
        double x = currentX + stemLength * Math.cos(Math.toRadians(angle));
        double y = currentY + stemLength * Math.sin(Math.toRadians(angle));
        
        g2.setStroke(new BasicStroke(1));
        g2.setColor(Color.PINK);
        g2.fill(new Ellipse2D.Double(x - petalSize / 2, y - petalSize / 2, petalSize, petalSize));
    }
    
    private void drawCenter() {
        g2.setColor(Color.YELLOW);
        g2.fill(new Ellipse2D.Double(currentX - petalSize / 2, currentY + stemLength - petalSize / 2, petalSize, petalSize));
    }
}