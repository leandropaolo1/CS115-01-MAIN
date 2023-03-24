package week12;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.awt.Stroke;
import javax.swing.JPanel;
import java.awt.geom.*;

/**
 * Class used to create a DrawPanel where shapes will be drawn by the programmer (via code).
 * 
 * @author Jared N. Plumb
 * @version 1.0
 * @since 2019-11-26
 * @Minor modifications by Jeff Light
 * @since 2019-12-01
 */
public class DrawPanel extends JPanel {
	//Attributes
	private static final long serialVersionUID = 6311020027600344213L;

	public DrawPanel() {
		this.setPreferredSize(new Dimension(1600, 900));	//Sets the dimensions of the DrawPanel.  Change this if your screen doesn't support this size.
		this.setOpaque(true);
		this.setBackground(Color.WHITE);			//Sets the background of the DrawPanel LIGHT_GRAY.  You may change this if desired.
	}
	
	
	/**
	 * Overrides the JComponent.paintComponent method.
	 * EVERYTHING that gets drawn to the Component (which sits on the content frame of the JFrame) is drawn in this method.
	 * Draw12a
	 * Draw all your objects in the paintComponent method.
	 * Automatically called by the event handler whenever the screen needs to be redrawn.
	 * DO NOT CALL THIS METHOD MANUALLY
	 * 
	 * @param	g	//All drawing in Java must go through a Graphics object
	 */
	@Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;

    // Draw 6 shapes with fill
    g2d.setColor(Color.BLUE);
    g2d.fillOval(50, 50, 100, 100);
    g2d.setColor(Color.RED);
    g2d.fillRect(200, 50, 100, 100);
    g2d.setColor(Color.GREEN);
    g2d.fillRect(350, 50, 150, 100);
    g2d.setColor(Color.YELLOW);
    int[] xPoints = {600, 600, 700};
    int[] yPoints = {50, 150, 150};
    g2d.fillPolygon(xPoints, yPoints, 3);
    g2d.setColor(Color.MAGENTA);
    int[] xPointsHex = {100, 150, 200, 200, 150, 100};
    int[] yPointsHex = {250, 250, 300, 350, 350, 300};
    g2d.fillPolygon(xPointsHex, yPointsHex, 6);
    g2d.setColor(Color.CYAN);
    int[] xPointsPent = {350, 450, 500, 425, 300};
    int[] yPointsPent = {250, 250, 325, 400, 325};
    g2d.fillPolygon(xPointsPent, yPointsPent, 5);

    g2d.setColor(Color.BLACK);
    g2d.setStroke(new BasicStroke(5));
    g2d.drawOval(150, 300, 100, 100);
    g2d.drawRect(300, 300, 100, 100);
    g2d.drawRoundRect(450, 300, 150, 100, 20, 20);
    int[] xPoints2 = {700, 650, 750};
    int[] yPoints2 = {300, 400, 400};
    g2d.drawPolygon(xPoints2, yPoints2, 3);
    int[] xPointsHex2 = {200, 250, 300, 300, 250, 200};
    int[] yPointsHex2 = {500, 500, 550, 600, 600, 550};
    g2d.drawPolygon(xPointsHex2, yPointsHex2, 6);
    int[] xPointsPent2 = {450, 550, 600, 525, 400};
    int[] yPointsPent2 = {500, 500, 575, 650, 575};
    g2d.drawPolygon(xPointsPent2, yPointsPent2, 5);
}


}//end of class DrawPanel