/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Lesson Learned: I learned how to draw with java, this draws a building
 * Class: 115-01
 * Date: 28-MAR-2023
 * Assignment: 13a
 * 
 */

package week12;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class House extends LandscapeObject {

    private int width;     // Width of the building
    private int height;    // Height of the building

    public House(Graphics2D g2, int x, int y, double scale, int width, int height) {
        super(g2, x, y, scale);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        g2.setColor(Color.GRAY);
        g2.fillRect(currentX, currentY+100, width, height);

        // Draw the roof
        int[] xPoints = { currentX - 10, currentX + width / 2, currentX + width + 10 };
        int[] yPoints = { currentY + height, currentY - 10, currentY + height };
        g2.setColor(Color.RED);
        g2.fillPolygon(xPoints, yPoints, 3);

        // Draw the door
        int doorHeight = height / 2;
        int doorWidth = doorHeight / 2;
        g2.setColor(Color.black);
        g2.fillRect(currentX + width / 2 - doorWidth / 2, currentY + height - doorHeight+100, doorWidth, doorHeight);

        // Draw the windows
        int windowWidth = width / 10;
        int windowHeight = height / 6;
        g2.setColor(Color.WHITE);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                g2.fillRect(currentX + width / 4 + j * windowWidth+20, currentY + height / 4 + i * windowHeight +30, windowWidth, windowHeight);
            }
        }
    }

    @Override
    public void applyScale() {
        // Update the width and height of the building according to the scale
        width = (int) (width * this.getScale());
        height = (int) (height * this.getScale());
    }
}
