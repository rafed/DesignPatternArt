package river;

import java.awt.Color;
import java.awt.Graphics;

public class AmericaRiver extends River{

	public void draw(Graphics g){
		g.setColor(new Color(135,206,250));
		actualDraw(g);
	}
	
}
