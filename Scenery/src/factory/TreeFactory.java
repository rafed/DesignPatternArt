package factory;

import java.util.HashMap;

import tree.*;

public class TreeFactory {

	private static final HashMap<String, Tree> map = new HashMap<String, Tree>();

	public static Tree getTree(String string){
		Tree tree = (Tree) map.get(string);

		if(tree == null){
			if(string.equals("ASIA")){
				tree = new AsiaTree();
			}
			else if(string.equals("AFRICA")){
				tree = new AfricaTree();
			}
			else if(string.equals("AMERICA")){
				tree = new AmericaTree();
			}
			map.put(string, tree);
		}

		return tree;
	}
	
}
