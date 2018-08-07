package testInterface;

public class Application {

	public static void main(String[] args) {

		//Creation d'une instance note et note2 de la Classe ImplInterface1/ImplInterface2
		ImplInterface1 note = new ImplInterface1();
		ImplInterface2 note2 = new ImplInterface2(); 

		note.setV1(14);
		note.setV2(12);
		
		note2.setV1(165);
		note2.setV2(189);
		note2.setV3(171);
		
		
		//Appelle de la methode minimum
		int noteMinimumn = note.minimum();
		int noteMinimum2 = note2.minimum();
		//Appelle de la methode maximum
		int noteMaximum = note.maximum();
		int noteMaximum2 = note2.maximum();
		System.out.println("Voici un exemple des méthodes de la Classe ImplInterface1 : ");
		System.out.println(noteMinimumn);
		System.out.println(noteMaximum);
		System.out.println("----- ----- ----- ----- -----");
		System.out.println("Voici un exemple des méthodes de la Classe ImplInterface2 : ");
		System.out.println(noteMinimum2);
		System.out.println(noteMaximum2);
		
	}

}
