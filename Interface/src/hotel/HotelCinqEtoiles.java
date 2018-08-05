package hotel;

public class HotelCinqEtoiles implements HotelLuxe {
String piscine;
String taxi;

public void descriptionPiscineLuxe() {
	System.out.println(piscine);
}
public void reserverTaxi() {
	System.out.println(taxi);
}
public String getPiscine() {
	return piscine;
}
public void setPiscine(String piscine) {
	this.piscine = piscine;
}
public String getTaxi() {
	return taxi;
}
public void setTaxi(String taxi) {
	this.taxi = taxi;
}

}

