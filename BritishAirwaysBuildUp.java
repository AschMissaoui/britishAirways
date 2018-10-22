
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


    public static void main(String[] args)  {

        buildAirline();
        buildPilots() ;
        buildCity();
        buildAirports();
        buildPlane();
        buildSeats();
        buildPassengers();
        buildFlight() ;


       outFlight.show(); /** Mistake not found */
       returnFlight.show();


    }
    public static void buildAirline(){
        theAirline = new Fluglinie("BA" , "British Airways");

    }
    public static void buildPilots() {

       thePilot = new Pilot("chris", 7, theAirline, outFlight);

       theCopilot = new Pilot("Adam" , 8 , theAirline ,outFlight) ;
    }

    public static void buildFlight() {
        outFlight = new Flug("123", "20.10.2018", flughafen1,
                flughafen2, theAirplane, theAirline,
                thePilot , theCopilot , stadt1 , stadt2 ) ;
        returnFlight = new Flug("132", "27.10.2018", flughafen2,
                flughafen1, theAirplane, theAirline,
                thePilot , theCopilot , stadt2 , stadt1 ) ;


        outFlight.addPassagier(passagier1);
        outFlight.addPassagier(passagier2);
        returnFlight.addPassagier(passagier1);
    }

    public static void buildPassengers(){
        passagier1 = new Passagier("Marc", "AKf", "m", outFlight, sitzplatz1) ;
        passagier2 = new Passagier("Lisa", "AKf", "w", outFlight, sitzplatz2) ;
    }

    public static void buildPlane() {
        theAirplane = new Flugzeug("772", 555, 4, 720, 853) ;
    }

    public static void buildCity(){
        stadt1 = new Stadt("Stuttgart") ;
        stadt2 = new Stadt("New York") ;
    }

    public static void buildAirports(){
        flughafen1 = new Flughafen("Stuttgart Airport" , "STR");
        flughafen2 = new Flughafen("LaGuardia Airport" , "LGA") ;
    }
    public static void buildSeats() {
        sitzplatz1 = new Sitzplatz("C", "12", passagier1,theAirplane);
        sitzplatz2 = new Sitzplatz("B", "12", passagier2,theAirplane) ;
        sitzplatz3 = new Sitzplatz("A", "22", passagier1,theAirplane) ;
    }



}