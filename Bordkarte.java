/**
 * @author Achref Missaoui
 * @version 17.10.2018
 */


public class Bordkarte {

    private Passagier passenger;
    private Flug flight;
    private Sitzplatz seat;


    /**
     * Konstruktor
     * @param thePassenger : Passagier
     * @param theFlight : Flug
     * @param theSeat : Sitzplatz
     */
    public Bordkarte(Passagier thePassenger, Flug theFlight, Sitzplatz theSeat){
        this.passenger = thePassenger;
        this.flight = theFlight;
        this.seat = theSeat;
    }

    /**
     * Prints out the Ticket
     * @return String
     */

    public String toString(){
        return("Passagier: " + passenger.toString() +
                "Flug: " + flight.toString() +
                "Sitzplatz: " + seat.toString());
    }



}

