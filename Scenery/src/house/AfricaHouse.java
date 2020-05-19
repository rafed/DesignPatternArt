package house;

import java.awt.Color;
import java.awt.Graphics;


public class AfricaHouse extends House{

	public void draw(Graphics g){
		g.setColor(new Color(139, 69, 19));
		g.fillOval(x, y, 30, 30);
		
		this.base = new Base(x, y + 15);
		base.draw(g);
	}
	
}
