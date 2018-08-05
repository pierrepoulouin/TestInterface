package vehicule;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creation des instances hoberboard1 et jeep1 des classes Hoverboard et Jeep
		Hoverboard hoverboard1 = new Hoverboard();
		Jeep jeep1 = new Jeep();
		
		//on ajoute des valeurs concretes aux variables
		hoverboard1.setName("Le Simplon");
		hoverboard1.setMaxPassengers(4);
		hoverboard1.setMaxSpeed(80);
		hoverboard1.setNumWheels(0);
		hoverboard1.setDisplacement(25000);
		
		jeep1.setName("Le Fadi");
		jeep1.setMaxPassengers(2);
		jeep1.setMaxSpeed(90);
		jeep1.setNumWheels(4);
		
		//appelle des méthodes de la classe hoverboard et Jeep
		
		jeep1.soundHorn();
		
		hoverboard1.enterLand();
		hoverboard1.enterSea();
	}

}
