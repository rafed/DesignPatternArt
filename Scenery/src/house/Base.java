package house;

import java.awt.Color;
import java.awt.Graphics;

public class Base {

	private int x, y;

	public Base(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void draw(Graphics g){
		g.setColor(new Color(40, 40, 40));
		g.fillRect(x, y, 30, 30);
	}
	
}
