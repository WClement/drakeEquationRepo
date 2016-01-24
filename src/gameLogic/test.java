package gameLogic;

import model.manager.CelestialObjectManager;

/*import Elements2000K;
import Elements300K;
import Elements50K;
import Planet;
import PlanetFactory;
import Star;
import StarFactory;*/

public class test {
		public static void main(String[] args){
			CelestialObjectManager game = new CelestialObjectManager(null);
			game.createGalaxy();
		}
}
