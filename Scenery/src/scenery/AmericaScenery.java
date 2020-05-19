package scenery;

import java.awt.Graphics;

import tree.Tree;
import factory.*;
import house.House;

public class AmericaScenery extends Scenery{
	
	protected void drawTree(Graphics g) {
		for(int i=0,l=70; i<4; i++,l+=50){
			for(int j=0,h=20; j<4; j++,h+=80){
				Tree tree = TreeFactory.getTree("AMERICA");
				tree.setXY(l, h);
				tree.draw(g);
			}
		}
	}

	protected void drawRiver(Graphics g) {
		RiverFactory.getRiver("AMERICA").draw(g);;
	}

	protected void drawHouse(Graphics g) {
		for(int i=0,l=470; i<4; i++,l+=40){
			for(int j=0,h=20; j<4; j++,h+=80){
				House house= HouseFactory.getHouse("AMERICA");
				house.setXY(l, h);
				house.draw(g);
			}
		}
	}

}
