package hotel;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cr�ation des objets hotelSimplon et hotelInfocop
		HotelCinqEtoiles hotelInfocop = new HotelCinqEtoiles();
		HotelSeptEtoiles hotelSimplon = new HotelSeptEtoiles();
		
		hotelInfocop.setPiscine("Une pisicine � bulle");
		hotelInfocop.setTaxi("Taxi rapide");
		
		hotelInfocop.descriptionPiscineLuxe();
		hotelInfocop.reserverTaxi();
		
		hotelSimplon.setPiscine("Une piscine � bulle avec champagne");
		hotelSimplon.setTaxi("Taxi rapide avec playlist personnalis�e");

		hotelSimplon.descriptionPiscineLuxe();
		hotelSimplon.reserverTaxi();
	}

}
