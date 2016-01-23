package gameLogic;

import java.util.ArrayList;

abstract class StarFactory {
	public static Star theStar(){
		Star star = new makeStar();
		return star;
	}
}
class makeStar extends Star{

	@Override
	public Star makeStar(int size) {
		this.size = size;
		this.name = "Ceres";
		this.solarSystem = getSolarSystem(size, this.name);
		return null;
	}
	
	@Override
	public ArrayList<Planet> getSolarSystem(int size, String name) {	
		ArrayList<Planet> solarSystem = new ArrayList<Planet>();
		char planetName = 'A';
		for(int i = 0; i < size/10; i++){
			if(i < 3){
				Planet closePlanet = PlanetFactory.thePlanet("2000K");
				closePlanet.makePlanet(name);
				closePlanet.name = name + "-" + planetName;
				planetName++;
				solarSystem.add(closePlanet);
			}
			else if(i < 6){
				Planet midPlanet = PlanetFactory.thePlanet("300K");
				midPlanet.makePlanet(name);
				midPlanet.name = name + "-" + planetName;
				planetName++;
				solarSystem.add(midPlanet);
			}
			else{
				Planet farPlanet = PlanetFactory.thePlanet("50K");
				farPlanet.makePlanet(name);
				farPlanet.name = name + "-" + planetName;
				planetName++;
				solarSystem.add(farPlanet);
			}
		}
		return solarSystem;
	}	
}
