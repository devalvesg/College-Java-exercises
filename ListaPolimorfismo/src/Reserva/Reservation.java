package Reserva;

import java.util.ArrayList;
import java.util.Date;

public class Reservation {

    private int id;

    private Date date;

    private Passenger passengers;

    private Flight flights;

    public Reservation(int id, Date date, Passenger passenger, Flight flight) {
        setId(id);
        setDate(date);
        setPassengers(passenger);
        setFlights(flight);
    }

    public Passenger getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger passengers) {
        this.passengers = passengers;
    }

    public Flight getFlights() {
        return flights;
    }

    public void setFlights(Flight flights) {
        this.flights = flights;
    }

    public Reservation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date=" + date +
                ", passengers=" + passengers +
                ", flights=" + flights +
                '}';
    }
}
