package gameLogic;

public class test {
		public static void main(String[] args){
			Planet closePlanet = PlanetFactory.thePlanet("2000K");
			closePlanet.makePlanet();
			Planet midPlanet = PlanetFactory.thePlanet("300K");
			midPlanet.makePlanet();
			Planet farPlanet = PlanetFactory.thePlanet("50K");
			farPlanet.makePlanet();
			
			System.out.println("close planet atmosphere: " + closePlanet.atmosphere);
			System.out.print("close planet contains ");
			for(Elements2000K ele2000: closePlanet.elements2000){
				System.out.print(ele2000 + " ");
			}
			System.out.println();
			System.out.println("midplanet atmosphere: " + midPlanet.atmosphere);
			System.out.print("mid planet contains ");
			for(Elements300K ele300: midPlanet.elements300){
				System.out.print(ele300 + " ");
			}
			System.out.println();
			System.out.println("far planet atmosphere: " + farPlanet.atmosphere);
			System.out.print("far planet contains ");
			for(Elements50K ele50: farPlanet.elements50){
				System.out.print(ele50 + " ");
			}
			System.out.println();
		}
}
