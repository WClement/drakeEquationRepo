package gameLogic;

public class UnitFactory {
	public static Units theUnit(String unit, Race race){
		if(race == HUMANS){
			if(unit.equals("harvester")){
				return new humanHarvester();
			}
			else if(unit.equals("soldier")){
				return new humanSoldier();
			}
			else if(unit.equals("settler")){
				return new humanSettler();
			}
			else if(unit.equals("leader")){
				return new humanLeader();
			}
		}
		else if(race == MUSHII){
			if(unit.equals("harvester")){
				return new mushiiHarvester();
			}
			else if(unit.equals("soldier")){
				return new mushiiSoldier();
			}
			else if(unit.equals("settler")){
				return new mushiiSettler();
			}
			else if(unit.equals("leader")){
				return new mushiiLeader();
			}
		}
		else if(race == ORDER){
			if(unit.equals("harvester")){
				return new orderHarvester();
			}
			else if(unit.equals("soldier")){
				return new orderSoldier();
			}
			else if(unit.equals("settler")){
				return new orderSettler();
			}
			else if(unit.equals("leader")){
				return new orderLeader();
			}
		}
		else{
			return null;
		}		
	}
}

class humanHarvester extends Units{

}

class humanSoldier extends Units{
	
}

class humanSettler extends Units{
	
}

class humanLeader extends Units{
	
}

class mushiiHarvester extends Units{

}

class mushiiSoldier extends Units{
	
}

class mushiiSettler extends Units{
	
}

class mushiiLeader extends Units{
	
}

class orderHarvester extends Units{

}

class orderSoldier extends Units{
	
}

class orderSettler extends Units{
	
}

class orderLeader extends Units{
	
}