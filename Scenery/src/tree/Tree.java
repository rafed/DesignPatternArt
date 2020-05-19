package tree;

import java.awt.Graphics;

public abstract class Tree {

	protected int x, y;
	protected Root root;
	
	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public abstract void draw(Graphics g);
}
