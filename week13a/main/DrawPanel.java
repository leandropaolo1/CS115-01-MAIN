/*
 * Student: Leandro Cooper
 * Teacher: Sister Barbara Chamberlin
 * Description: The tree program draws a green tree with brown trunk and multiple layers of branches made of triangles pointing upwards.
 * The tree's size and number of layers can be adjusted using the program's settings.
 * Lesson Learned: In this lab, I learned how to create a tree shape using Java programming language.
 * I learned how to use basic graphics concepts.
 * Class: 115-01
 * Date: 24-MAR-2023
 * Assignment: 12b
 * 
 */



package main;
import week12.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

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
	
	//Landscape Colors
	private final String LIGHT_SKY_BLUE = "87CEFA";
	private final String LAWN_GREEN = "7CFC00";

	//Tree Colors
	private final String BROWN = "A52A2A";
	private final String DARK_GREEN = "006400";
	private final String FOREST_GREEN = "228B22";
	private final String GRAY = "808080";
	
	//House Colors



	

	public DrawPanel() {
		this.setPreferredSize(new Dimension(1600, 900));	//Sets the dimensions of the DrawPanel.  Change this if your screen doesn't support this size.
		this.setOpaque(true);
		this.setBackground(Color.WHITE);			//Sets the background of the DrawPanel LIGHT_GRAY.  You may change this if desired.
	}
	/**
	 * Overrides the JComponent.paintComponent method.
	 * EVERYTHING that gets drawn to the Component (which sits on the content frame of the JFrame) is drawn in this method.
	 * Draw12b
	 * Draw all your objects here.
	 * Automatically called by the event handler whenever the screen needs to be redrawn.
	 * DO NOT CALL THIS METHOD MANUALLY
	 * 
	 * @param	g	//All drawing in Java must go through a Graphics object
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;			//Allows us to draw using both the Graphics class methods and the Graphics2D class methods

		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);	//Makes drawn shapes and fonts clearer

		//DrawTree landscape
		g2.setColor(Color.decode("#" + LIGHT_SKY_BLUE));
		g2.fillRect(0,0,this.getWidth(),this.getHeight());
		
		g2.setColor(Color.decode("#" + LAWN_GREEN));
		g2.fillOval((-600), 350, this.getWidth() + 1200, 700);
		
		//DrawTree Trees
		Tree t1 = new Tree(g2, 50, 400, 1, 3, BROWN , DARK_GREEN);
		t1.draw();
		
		Tree t2 = new Tree(g2, 200, 375, 2, 5, BROWN , GRAY);
		t2.draw();
		
		Tree t3 = new Tree(g2, 300, 450, 3, 4, BROWN , FOREST_GREEN);
		t3.draw();
		
		Car car = new Car(g2, 300, 450, 3, Color.RED , Color.BLACK, 100,35, 20);
		
		car.draw();
		//Populate the scene with your own trees here!
		
		Building building = new Building(g2, 700, 250, 3, 25,50);
		building.draw();

		Building building1 = new Building(g2, 900, 230, 3, 25,50);
		building1.draw();

		Sun sun = new Sun(g2,100,100,3,30);
		sun.draw();


		House house = new House(g2, 1000, 300, 3.0, 150, 100);
		house.draw();
	}

}//end of class DrawPanel