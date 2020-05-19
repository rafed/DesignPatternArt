package factory;

import java.util.HashMap;

import house.*;

public class HouseFactory {

	private static final HashMap<String, House> map = new HashMap<String, House>();

	public static House getHouse(String string){
		House house = (House) map.get(string);

		if(house == null){
			if(string.equals("ASIA")){
				house = new AsiaHouse();
			}
			else if(string.equals("AFRICA")){
				house = new AfricaHouse();
			}
			else if(string.equals("AMERICA")){
				house = new AmericaHouse();
			}
			map.put(string, house);
		}

		return house;
	}
}
