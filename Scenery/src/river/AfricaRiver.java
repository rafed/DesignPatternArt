package river;

import java.awt.Color;
import java.awt.Graphics;

public class AfricaRiver extends River{

	public void draw(Graphics g){
		g.setColor(new Color(65,105,225));
		actualDraw(g);
	}
	
}
