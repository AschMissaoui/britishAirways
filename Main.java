
public class BritishAirwaysBuildUp {
    Fluglinie theAirline;
    Pilot thePilot;
    Pilot theCopilot;
    Flug outFlight;
    Flug returnFlight;
    Passagier passagier1;
    Passagier passagier2;
    Flugzeug theAirplane;
    Stadt stadt1;
    Stadt stadt2;
    Flughafen flughafen1;
    Flughafen flughafen2;
    Sitzplatz sitzplatz1;
    Sitzplatz sitzplatz2;
    Sitzplatz sitzplatz3;


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



}