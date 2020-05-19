package factory;

import java.util.HashMap;

import river.*;

public class RiverFactory {

	private static final HashMap<String, River> map = new HashMap<String, River>();

	public static River getRiver(String string){
		River river = (River) map.get(string);

		if(river == null){
			if(string.equals("ASIA")){
				river = new AsiaRiver();
			}
			else if(string.equals("AFRICA")){
				river = new AfricaRiver();
			}
			else if(string.equals("AMERICA")){
				river = new AmericaRiver();
			}
			map.put(string, river);
		}

		return river;
	}
	
}
