package gameLogic;

import java.util.ArrayList;

public abstract class Planet {
	protected String name;
	protected ArrayList<Elements2000K> elements2000 = new ArrayList<Elements2000K>();
	protected ArrayList<Elements300K> elements300 = new ArrayList<Elements300K>();
	protected ArrayList<Elements50K> elements50 = new ArrayList<Elements50K>();
	protected Atmosphere atmosphere;
	protected boolean discovered;
	protected boolean colonized;
	
	abstract public Planet makePlanet();
	
}
