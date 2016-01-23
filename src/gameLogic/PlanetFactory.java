package gameLogic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;

public class PlanetFactory {
	public static Planet thePlanet(String distance){
		if(distance.equals("2000K")){
			return new closePlanet();
		}
		else if(distance.equals("300K")){
			return new midPlanet();
		}
		else if(distance.equals("50K")){
			return new farPlanet();
		}
		else{
			return null;
		}
	}
}

class farPlanet extends Planet{

	@Override
	public Planet makePlanet() {
		this.elements300 = null;
		this.elements2000 = null;
		this.elements50 = getElements();
		this.atmosphere = getAtmosphere();
		this.discovered = false;
		this.colonized = false;
		return this;
	}
	public ArrayList<Elements50K> getElements(){
		ArrayList<Elements50K> elements50 = new ArrayList<Elements50K>(EnumSet.allOf(Elements50K.class));
		Collections.shuffle(elements50);
		elements50.remove(5);
		elements50.remove(4);
		elements50.remove(3);
		return elements50;
	}
	public Atmosphere getAtmosphere(){
		return Atmosphere.values()[(int) (Math.random() * Atmosphere.values().length)];
	}
	
	
}
class midPlanet extends Planet{

	@Override
	public Planet makePlanet() {
		this.elements300 = getElements();
		this.elements2000 = null;
		this.elements50 = null;
		this.atmosphere = getAtmosphere();
		this.discovered = false;
		this.colonized = false;
		return this;
	}

	public ArrayList<Elements300K> getElements(){
		ArrayList<Elements300K> elements300 = new ArrayList<Elements300K>(EnumSet.allOf(Elements300K.class));
		Collections.shuffle(elements300);
		elements300.remove(5);
		elements300.remove(4);
		elements300.remove(3);
		return elements300;
	}
	public Atmosphere getAtmosphere(){
		return Atmosphere.values()[(int) (Math.random() * Atmosphere.values().length)];
	}
}
class closePlanet extends Planet{

	@Override
	public Planet makePlanet() {
		this.elements300 = null;
		this.elements2000 = getElements();
		this.elements50 = null;
		this.atmosphere = getAtmosphere();
		this.discovered = false;
		this.colonized = false;
		return this;
	}
	public ArrayList<Elements2000K> getElements(){
		ArrayList<Elements2000K> elements2000 = new ArrayList<Elements2000K>(EnumSet.allOf(Elements2000K.class));
		Collections.shuffle(elements2000);
		elements2000.remove(5);
		elements2000.remove(4);
		elements2000.remove(3);
		return elements2000;
	}
	public Atmosphere getAtmosphere(){
		return Atmosphere.values()[(int) (Math.random() * Atmosphere.values().length)];
	}
}
