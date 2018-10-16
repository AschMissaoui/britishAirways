/**
 * @author Lisa Uhlig
 * @version 6. Oktober 2018
 */
public class Sitzplatz {
    private String reihe;
    private String nummer;
    private Passagier passagier;
    private Flugzeug flugzeug;


    public Sitzplatz(String reihe, String nummer, Passagier passagier,Flugzeug flugzeug){
        this.reihe = reihe;
        this.nummer = nummer;
        System.out.println(toString()+" angelegt.");
        this.passagier=passagier;
        this.flugzeug=flugzeug;

    }

    public String getReihe(){
        return reihe;
    }
    public String getNummer(){
        return nummer;
    }
    public Passagier getPassagier() { return passagier; }
    public void setFlugzeug(Flugzeug flugzeug) { this.flugzeug = flugzeug; }
    public Flugzeug getFlugzeug() { return flugzeug; }
    public void setPassagier(Passagier passagier){this.passagier=passagier;}
    public void setReihe(String r){
        this.reihe = r;
    }
    public void setNummer(String r){
        this.nummer= r;
    }
    public String toString() {
        return("Sitzplatz "+reihe+nummer);
    }
    public void saeubern(){
        System.out.println(toString()+" wird gesaeubert.");
    }
    public void reservieren(){
        System.out.println((toString()+" wird reserviert."));
    }
    public void heizen(){
        System.out.println(toString()+ " wird geheizt.");
    }
}
