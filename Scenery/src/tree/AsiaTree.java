package tree;

import java.awt.Color;
import java.awt.Graphics;

public class AsiaTree extends Tree{

	public void draw(Graphics g){
		this.root = new Root(x + 18, y + 35);
		root.draw(g);
		
		g.setColor(Color.GREEN);
		g.fillOval(x, y, 40, 40);
	}
	
}
