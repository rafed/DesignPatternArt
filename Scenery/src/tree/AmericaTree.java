package tree;

import java.awt.Color;
import java.awt.Graphics;

public class AmericaTree extends Tree{

	public void draw(Graphics g){
		this.root = new Root(x - 2, y + 35);
		root.draw(g);
		
		g.setColor(new Color(0, 90, 0));
		g.fillPolygon(new int[]{x-20, x, x+20}, new int[]{y+60, y, y+60}, 3);
	}
	
}
