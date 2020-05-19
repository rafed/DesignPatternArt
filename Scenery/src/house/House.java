package house;

import java.awt.Graphics;

public abstract class House {

	protected int x, y;
	protected Base base;
	
	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public abstract void draw(Graphics g);
}
