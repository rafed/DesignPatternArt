package tree;

import java.awt.Color;
import java.awt.Graphics;

public class AfricaTree extends Tree{

	public void draw(Graphics g){
		this.root = new Root(x + 18, y + 25);
		root.draw(g);
		
		g.setColor(Color.YELLOW);
		g.fillOval(x, y, 40, 30);
	}
	
}
