package river;

import main.Main;

import java.awt.Graphics;

public abstract class River {

	void actualDraw(Graphics g){
		g.fillRect(Main.WIDTH/2 -50, 0, 100, Main.HEIGHT);
	}
	
	public abstract void draw(Graphics g);
}
