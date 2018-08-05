package hotel;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//création des objets hotelSimplon et hotelInfocop
		HotelCinqEtoiles hotelInfocop = new HotelCinqEtoiles();
		HotelSeptEtoiles hotelSimplon = new HotelSeptEtoiles();
		
		hotelInfocop.setPiscine("Une pisicine à bulle");
		hotelInfocop.setTaxi("Taxi rapide");
		
		hotelInfocop.descriptionPiscineLuxe();
		hotelInfocop.reserverTaxi();
		
		hotelSimplon.setPiscine("Une piscine à bulle avec champagne");
		hotelSimplon.setTaxi("Taxi rapide avec playlist personnalisée");

		hotelSimplon.descriptionPiscineLuxe();
		hotelSimplon.reserverTaxi();
	}

}
