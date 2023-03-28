package week12;


import java.awt.Graphics2D;

/**
 * Class used as a superclass to all objects created for a landscape scene.
 * Note this class has 3 protected attributes for convenience in coding subclass methods.  Getter and Setter methods are not needed for these attributes
 * protected int currentX
 * protected int currentY
 * protected Graphics2D
 * 
 * When creating an object in the DrawPanel.paintComponent(Graphics) method, usually the following syntax is used.
 * 
 * LandscapeObjectSubClass o1 = new LandscapeObjectSubClass(args);
 * o1.draw();
 * 
 * @author Jeffrey L Light
 * @version 1.0
 * @since 2019-11-26
 */
public abstract class LandscapeObject {
	//Attributes
	private int startX;			//Starting x coordinate for the object.  This doesn't change once the object has been created.
	private int startY;			//Starting y coordinate for the object.  This doesn't change once the object has been created.
	protected int currentX;		//PROTECTED.  The current x coordinate for the object.  This will change as different shapes are added to the object.  Usually the starting point for the next shape drawn.
	protected int currentY;		//PROTECTED.  The current y coordinate for the object.  This will change as different shapes are added to the object.  Usually the starting point for the next shape drawn.
	private double scale;		//Used in applyScale() method.  Multiplier for all shapes used in an object so that the entire object can be shrunk or grown with a single attribute to the constructor.
	protected Graphics2D g2;	//PROTECTED.  The Graphics2D interface
	
	public LandscapeObject(Graphics2D g2, int x, int y, double scale) {
		this.g2 = g2;			
		this.startX = x;
		this.currentX = x;
		this.startY = y;
		this.currentY = y;
		this.scale = scale;
	}//end of Constructor LandscapeObject
	
	

	public int getStartX() {
		return startX;
	}//end of method getX()
	

	public int getStartY() {
		return startY;
	}//end of method getY()

	public double getScale() {
		return scale;
	}//end of method getScale()

	public abstract void draw();


	public abstract void applyScale();
	
}//end of class LandscapeObject
