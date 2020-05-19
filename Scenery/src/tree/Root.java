package tree;

import java.awt.Color;
import java.awt.Graphics;

public class Root {

	private int x, y;
	
	public Root(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void draw(Graphics g){
		g.setColor(new Color(139, 69, 19));
		g.fillRect(x, y, 6, 40);
	}
	
}
