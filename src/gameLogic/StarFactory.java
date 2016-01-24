package gameLogic;

import java.util.ArrayList;

public class StarFactory {
	public Star newStar(int size, String name){
		Star newStar = new Star();
		newStar.setSize(size);
		newStar.setName(name);
		newStar.setSolarSystem(makeSolarSystem(size, name));
		System.out.println("Star " + name + " of size " + size + " contains " + size/10 + " planets:");
		for(Planet planets : newStar.getSolarSystem()){
			System.out.print(planets.name + " ");
		}
		System.out.println("\n");
		return newStar;
	}
	public ArrayList<Planet> makeSolarSystem(int size, String name) {	
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