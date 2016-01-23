package gameLogic;

/*import Elements2000K;
import Elements300K;
import Elements50K;
import Planet;
import PlanetFactory;
import Star;
import StarFactory;*/

public class test {
		public static void main(String[] args){
			Star firstStar = StarFactory.theStar();
			firstStar.makeStar(100);
			
			System.out.println("First star is called : " + firstStar.name + " and is size " + firstStar.size);
			System.out.print(firstStar.name + " has the planets ");
			for(Planet planets : firstStar.solarSystem){
				System.out.println(planets.name + " ");
				System.out.println(planets.name + "'s atmosphere is " + planets.atmosphere);
				System.out.print(planets.name + " contains ");
				if(planets.elements2000 != null){
					for(Elements2000K ele2000: planets.elements2000){
						System.out.print(ele2000 + " ");
					}
				}
				else if(planets.elements300 != null){
					for(Elements300K ele300: planets.elements300){
						System.out.print(ele300 + " ");
					}
				}
				else if(planets.elements50 != null){
					for(Elements50K ele50: planets.elements50){
						System.out.print(ele50 + " ");
					}
				}
				System.out.println();
			}
		}
}
