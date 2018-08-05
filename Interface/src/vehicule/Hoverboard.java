package vehicule;

// On implémente les interfaces IsLandVehicle et IsSeaVessel dans la class Hoverboard

public class Hoverboard implements IsLandVehicle, IsSeaVessel {

	//On initialise les variables

	String name = null;
	int maxPassengers = 0;
	int maxSpeed = 0;
	int numWheels = 0;
	int displacement = 0;


	public void enterLand () {
		System.out.println("Wellcome to the Land");

	}

	public void enterSea() {
		System.out.println("Wellcome to the sea");
	}
	//Génération des getters/setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}


}
