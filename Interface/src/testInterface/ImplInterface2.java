package testInterface;

public class ImplInterface2 implements ExempleInterface {
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

	public int getV3() {
		return v3;
	}

	public void setV3(int v3) {
		this.v3 = v3;
	}

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
