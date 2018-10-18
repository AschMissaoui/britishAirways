
public class BritishAirwaysBuildUp {
    static Fluglinie theAirline;
    static Pilot thePilot;
    static Pilot theCopilot;
    static Flug outFlight;
    static Flug returnFlight;
    static Passagier passagier1;
    static Passagier passagier2;
    static Flugzeug theAirplane;
    static Stadt stadt1;
    static Stadt stadt2;
    static Flughafen flughafen1;
    static Flughafen flughafen2;
    static Sitzplatz sitzplatz1;
    static Sitzplatz sitzplatz2;
    static Sitzplatz sitzplatz3;


    public static void main(String[] args) {

        buildAirline(theAirline);
        buildPilots(thePilot , theCopilot) ;
        buildFlight(outFlight , returnFlight) ;
        buildPassengers(passagier1 , passagier2);
        buildPlane(theAirplane);
        buildCity(stadt1 , stadt2);
        buildAirports(flughafen1 , flughafen2);
        buildSeats(sitzplatz1 , sitzplatz2 , sitzplatz3);

        outFlight.show();
        returnFlight.show();


    }
    public void buildAirline(Fluglinie F){
        F = new Fluglinie("BA" , "British Airways")

    }



}