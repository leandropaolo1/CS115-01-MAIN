/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Lesson Learned: I learned how to draw with java, this draws a sun
 * Class: 115-01
 * Date: 28-MAR-2023
 * Assignment: 13a
 * 
 */


package week12;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Sun extends LandscapeObject {

    private final int radius;

    public Sun(Graphics2D g2, int x, int y, double scale, int radius) {
        super(g2, x, y, scale);
        this.radius = radius;
    }

    @Override
    public void draw() {
        g2.setColor(Color.YELLOW);
        Ellipse2D sun = new Ellipse2D.Double(currentX, currentY, radius * this.getScale(), radius * this.getScale());
        g2.fill(sun);
    }

    @Override
    public void applyScale() {
        // Not implemented
    }

}
