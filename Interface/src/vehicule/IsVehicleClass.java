package vehicule;

public class IsVehicleClass implements IsVehicle {

	//attributs de la classe
	String Name;
	int maxPassengers;
	int maxSpeed;
	
	//méthodes de la classe
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
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


}
