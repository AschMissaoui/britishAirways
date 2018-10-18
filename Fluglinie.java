import java.util.LinkedList;
/**
 * 
 * @author Achref Missaoui
 * @version 4. Oktober 2018
 *
 */
public class Fluglinie {
    private LinkedList<Pilot> listPilots = new LinkedList<>();
    //List of Pilots employed by [airline]
    private LinkedList<Flug> listFlights = new LinkedList<>();
    //List of Flights operated by [airline]
    private String Iata; //International Air Transport Association airline code
    private String Name; // Airline Full name.

    /**
     * Konstruktor
     *
     * @param iata : IATA reservation code
     * @param name : airline full name
     */
    public Fluglinie(String iata, String name) {
        this.Iata = iata;
        this.Name = name;
        System.out.println(this.toString() + "angelegt.");
    }

    /**
     * returns the IATA airline designator
     */
    private String getIata() {
        return this.Iata;
    }

    /**
     * returns the airline's full name
     */
    private String getName() {
        return this.Name;
    }

    /**
     * adds a pilot to the list of employees
     *
     * @param p : pilot
     */
    public void addPilot(Pilot p) {
        listPilots.add(p);
    }

    /**
     * adds a flight to the list of flights
     * param f : flight
     */
    public void addFlight(Flug f) {
        listFlights.add(f);
    }

    /**
     * prints out information about the airline
     */
    public String toString() {
        String S = "Fluglinie " + this.getName() + " ";
        return S;
    }







}
