package testInterface;

public class ImplInterface1 implements ExempleInterface {
	public int v1;
	public int v2;
	
	public int minimum() {
		return(Math.min(v1, v2));
	}

	public int maximum() {
		return(Math.max(v1, v2));
	}
}
