package scenery;

import java.awt.Graphics;

import factory.HouseFactory;
import factory.TreeFactory;
import house.House;
import river.AsiaRiver;
import tree.Tree;


public class AsiaScenery extends Scenery{

	protected void drawTree(Graphics g) {
		for(int i=0,l=50; i<4; i++,l+=50){
			for(int j=0,h=20; j<4; j++,h+=80){
				Tree tree = TreeFactory.getTree("ASIA");
				tree.setXY(l, h);
				tree.draw(g);
			}
		}
	}

	protected void drawRiver(Graphics g) {
		new AsiaRiver().draw(g);
	}

	protected void drawHouse(Graphics g) {
		for(int i=0,l=450; i<4; i++,l+=60){
			for(int j=0,h=20; j<4; j++,h+=80){
				House house= HouseFactory.getHouse("ASIA");
				house.setXY(l, h);
				house.draw(g);
			}
		}
	}

}
