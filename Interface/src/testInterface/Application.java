package testInterface;

public class Application {

	public static void main(String[] args) {
		
		//Creation d'une instance note de la Classe ImplInterface1
		ImplInterface1 note = new ImplInterface1();
		int v1 = 14;
		int v2 = 12;
		int noteMinimum =note.minimum();
		System.out.println(noteMinimum);

	}

}
