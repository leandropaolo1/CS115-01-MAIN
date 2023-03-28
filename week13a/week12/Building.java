package week12;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Building extends LandscapeObject {

    private int width;     // Width of the building
    private int height;    // Height of the building

    public Building(Graphics2D g2, int x, int y, double scale, int width, int height) {
        super(g2, x, y, scale);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        // Draw the building

        int door_height = (int) (height * this.getScale() * 0.20);
        int door_width = (int) (width * this.getScale() * 0.30);

        g2.setColor(Color.GRAY);
        g2.fillRect(currentX, currentY, (int) (width * this.getScale()), (int) (height * this.getScale()));
        
        g2.setColor(Color.white);
        g2.fillRect(
            currentX + (int) (this.getScale() * 9), currentY + (int) (this.height * this.getScale() - door_height), door_width, door_height);
        // Draw the windows
        g2.setColor(Color.WHITE);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                Rectangle window = new Rectangle(currentX + (int) (width * this.getScale() * 0.17) + j * (int) (width * this.getScale() * 0.15),
                        currentY + (int) (height * this.getScale() * 0.1) + i * (int) (height * this.getScale() * 0.2),
                        (int) (width * this.getScale() * 0.1), (int) (height * this.getScale() * 0.1));
                g2.fill(window);
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