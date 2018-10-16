/** 
 * @author Rudi Jakob
 * @version 7. Oktober 2018
 */


public class Flughafen{
    private String name;
    private String iata;
 public Stadt[] staedte = new Stadt[6];


    public Flughafen(String name,String iata){

        this.iata=iata;
        this.name=name;
        System.out.println(toString() + "angelegt.");
    }

   public String getName() {
        return name;
    }

    public String getIata() {
        return iata;
    }

    private void setName(String name) {
        this.name = name;
    }
    private void setIata(String iata) {
            this.iata = iata;
        }

    public String toString()
        {
            return ("Flughafen " + iata);

        }

    public void saeubern(){
        System.out.println(toString()+" wird gesaeubert.");
    }
    public void aufheizen(){
        System.out.println((toString()+" wird aufgeheizt."));
    }
    public void streichen(){
        System.out.println(toString()+" wird gestrichen.");
    }

}
