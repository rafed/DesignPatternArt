package river;

import java.awt.Color;
import java.awt.Graphics;

public class AsiaRiver extends River{

	public void draw(Graphics g){
		g.setColor(new Color(0,0,139));
		actualDraw(g);
	}
	
}
