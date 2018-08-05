package vehicule;

//On implémente l'interface IsLandVehicle dans la class Jeep
public class Jeep implements IsLandVehicle {

	//on initialise les variables
	String name = null;
	int maxPassengers = 0;
	int maxSpeed = 0;
	int numWheels = 0;

	//Declaration de la methode soundHorn
	public void soundHorn() {
		System.out.println("COINN COINN");
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



}
