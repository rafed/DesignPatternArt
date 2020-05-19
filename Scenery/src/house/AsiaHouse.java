package house;

import java.awt.Color;
import java.awt.Graphics;


public class AsiaHouse extends House{

	public void draw(Graphics g){
		g.setColor(new Color(90, 90, 90));
		g.fillPolygon(new int[]{x-30, x, x+30}, new int[]{y+30, y, y+30}, 3);
		
		this.base = new Base(x - 15, y + 30);
		base.draw(g);
	}
	
}
