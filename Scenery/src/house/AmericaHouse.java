package house;

import java.awt.Color;
import java.awt.Graphics;


public class AmericaHouse extends House{

	public void draw(Graphics g){
		g.setColor(new Color(50, 50, 50));
		g.fillRect(x, y , 26, 25);
		
		this.base = new Base(x - 2, y + 20);
		base.draw(g);
	}
	
}
