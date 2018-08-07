package vehicule;

public class IsLandVehicleClass 
extends IsVehicleClass implements IsLandVehicle {

	int numWheels;

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numbheels) {
		this.numWheels = numbheels;
	}
	
	
}
