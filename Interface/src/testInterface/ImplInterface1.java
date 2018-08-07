package testInterface;

public class ImplInterface1 implements ExempleInterface {
	public int v1;
	public int v2;
	
	//declaration des methodes
	public int minimum() {
		return(Math.min(v1, v2));
	}

	public int maximum() {
		return(Math.max(v1, v2));
		
	}

	public int getV1() {
		return v1;
	}

	public void setV1(int v1) {
		this.v1 = v1;
	}

	public int getV2() {
		return v2;
	}

	public void setV2(int v2) {
		this.v2 = v2;
	}
}
