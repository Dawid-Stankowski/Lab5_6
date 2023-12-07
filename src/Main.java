public class Main {
    public static void main(String[] args) {
        Samochod samochod = new Samochod("Suzuki", 2007, 4, "Diesel");
        // Rzut do Pojazd
        Pojazd pojazd1 = (Pojazd) samochod;
        // Dostęp do Pojazd
        System.out.println("Marka pojazdu: " + pojazd1.getMarka());
        System.out.println("Rok produkcji: " + pojazd1.getRokProdukcji());
        Motocykl motocykl = new Motocykl("Kawasaki", 2021, "Łańcuch", 500);
        // Rzut do Pojazd
        Pojazd pojazd2 = (Pojazd) motocykl;
        // Dostęp do Pojazd
        System.out.println("Marka pojazdu: " + pojazd2.getMarka());
        System.out.println("Rok produkcji: " + pojazd2.getRokProdukcji());
    }
}