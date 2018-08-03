package testInterface;

public class ImplInterface2 implements ExempleInterface {
	public int v1;
	public int v2;
	public int v3;
	
	public int minimum() {
		int temp = Math.min(v1,  v2);
		return(Math.min(temp,  v3));
	}

	public int maximum() {
		int temps = Math.max(v1, v2);
		return(Math.max(temps, v3));
	}
}
