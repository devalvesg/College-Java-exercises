package Reserva;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Passenger passenger = new Passenger(1, "Gabriel", "49778728660");
        Flight flight = new Flight(1, "São Paulo", "Rio de Janeiro");

        Reservation reservation = new Reservation(1, new Date(2024, 05, 20), passenger, flight);

        System.out.println(reservation);
    }
}
