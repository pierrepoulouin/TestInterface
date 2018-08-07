package vehicule;

// On implémente les interfaces IsLandVehicle et IsSeaVessel dans la class Hoverboard

public class Hoverboard extends IsLandVehicleClass implements IsLandVehicle, IsSeaVessel {

	//On initialise les variables

	int displacement = 0;


	public void enterLand () {
		System.out.println("Welcome to the Land");

	}

	public void enterSea() {
		System.out.println("Welcome to the sea");
	}
	//Génération des getters/setters

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}




}
