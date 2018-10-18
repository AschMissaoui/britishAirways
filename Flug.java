import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Darko Miklic
 * @version 5. Oktober 2018
 */

public class Flug {


    private String flugNummer;
    private String datum;
    private Pilot pilot1;
    private Pilot copilot1;
    private Flughafen startFlughafen;
    private Flughafen zielFlughafen;
    private Flugzeug flugzeug;
    private Fluglinie fluglinie;
    private Flughafen zwischenlandung;
    private Stadt startStadt;
    private Stadt zielStadt;
    private ArrayList<Passagier> PassagierListe = new ArrayList<>() ;


    /**
     * Constructor for the class Flug
     * @param flugNummer number to identify the flight
     * @param datum date at which the flight starts
     * @param startFlughafen starting airport of the flight
     * @param zielFlughafen landing airport of the flight
     * @param flugzeug the plane of the flight
     * @param fluglinie the airline which offers the flight
     * @param pilot1 the main pilot of the flight
     * @param copilot1 the copilot of the flight
     */
    public Flug(String flugNummer, String datum, Flughafen startFlughafen,
                Flughafen zielFlughafen, Flugzeug flugzeug, Fluglinie fluglinie,
                Pilot pilot1, Pilot copilot1) {

        this.flugNummer = flugNummer;
        this.datum = datum;
        this.startFlughafen = startFlughafen;
        this.zielFlughafen = zielFlughafen;
        this.flugzeug = flugzeug;
        this.fluglinie = fluglinie;
        this.pilot1 = pilot1;
        this.copilot1 = copilot1;

        System.out.println(toString() + " angelegt.");
    }


    public String getFlugNummer() {
        return flugNummer;
    }

    public String getDatum() {
        return datum;
    }

    public Fluglinie getFluglinie() { return fluglinie; }

    public Flughafen getStartFlughafen() { return startFlughafen; }

    public Flughafen getZielFlughafen() { return zielFlughafen; }

    public Flughafen getZwischenlandung() { return zwischenlandung; }

    public Pilot getPilot1() { return pilot1; }

    public Pilot getCopilot1() { return copilot1; }

    public Flugzeug getFlugzeug() { return flugzeug; }

    public void addPassagier( Passagier p) {
        PassagierListe.add(p);
    }

    public void setZweiPiloten(Pilot p1, Pilot p2) {
        this.pilot1 = p1;
        this.copilot1 = p2;
    }

    public void setFlughaefen(Flughafen f1, Flughafen f2) {
        this.startFlughafen = f1;
        this.zielFlughafen = f2;
    }
    public void setFlugNummer(String flugNummer){
        this.flugNummer = flugNummer;
    }
    public void setDatum(String datum){
        this.datum = datum;
    }
    public void setFlugzeug(Flugzeug flugzeug){
        this.flugzeug = flugzeug;
    }
    public void setFluglinie(Fluglinie fluglinie){ this.fluglinie=fluglinie; }
    public void setZwischenlandung(Flughafen flughafen){ this.zwischenlandung=flughafen; }

    public String toString() {
        return ("Flug " + flugNummer);
    }

    public void reservieren() {
        System.out.println(toString() + " wird reserviert.");
    }

    public void verspaeten() {
        System.out.println(toString() + " verspaetet sich.");
    }

    public void show() {

        System.out.println("angeboten von " + fluglinie);
        System.out.println(pilot1 + "[und " + copilot1 +"]");
        System.out.println("startet in " + startFlughafen +" bei " + startStadt);
        System.out.println("landet in " + zielFlughafen + " bei " + zielStadt);
        System.out.println("wird durchgef�hrt mit "+ flugzeug);
        System.out.println("befördert " + PassagierListe.get(0).toString() + PassagierListe.get(1).toString());
    }
}