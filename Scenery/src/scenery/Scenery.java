package scenery;

import java.awt.Graphics;

public abstract class Scenery {

	abstract protected void drawTree(Graphics g);
	abstract protected void drawRiver(Graphics g);
	abstract protected void drawHouse(Graphics g);
	
	public void draw(Graphics g){
		drawTree(g);
		drawRiver(g);
		drawHouse(g);
	}
}
