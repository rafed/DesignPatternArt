package scenery;

import java.awt.Graphics;

import factory.HouseFactory;
import factory.TreeFactory;
import house.House;
import river.AfricaRiver;
import tree.Tree;


public class AfricaScenery extends Scenery {

	protected void drawTree(Graphics g) {
		for(int i=0,l=50; i<4; i++,l+=50){
			for(int j=0,h=20; j<4; j++,h+=80){
				Tree tree = TreeFactory.getTree("AFRICA");
				tree.setXY(l, h);
				tree.draw(g);
			}
		}
	}

	protected void drawRiver(Graphics g) {
		new AfricaRiver().draw(g);
	}

	protected void drawHouse(Graphics g) {
		for(int i=0,l=470; i<4; i++,l+=40){
			for(int j=0,h=20; j<4; j++,h+=80){
				House house= HouseFactory.getHouse("AFRICA");
				house.setXY(l, h);
				house.draw(g);
			}
		}
	}

}
