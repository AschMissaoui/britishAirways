/**
 * @author Dennis Mohr
 * @version 7. Oktober 2018
 */
public class Passagier {

    private String name;
    private String nachname;
    private String geschl;
    private Flug flug;
    private Sitzplatz sitzplatz;

    public Passagier(String name, String nachname, String geschl, Flug flug, Sitzplatz sitzplatz) {

        this.name = name;
        this.nachname = nachname;
        this.geschl = geschl;
        this.flug=flug;
        this.sitzplatz=sitzplatz;
        isGeschlechtOK();
    }

    private void isGeschlechtOK() {
        if (geschl.equals("w") || geschl.equals("m")) {
        } else {
            System.out.println("Geben Sie 'w' fuer weiblich und 'm' fuer maennlich ein");
            System.exit(0);
        }
    }


    public String getName() {
        return name;
    }

    public String getNachname() {
        return nachname;
    }

    public String getGeschlecht() {
        return geschl;
    }

    public Sitzplatz getSitzplatz() { return sitzplatz; }

    public void setSitzplatz(Sitzplatz sitzplatz) { this.sitzplatz = sitzplatz; }

    public Flug getFlug() { return flug; }

    public void setFlug(Flug flug){ this.flug=flug; }

    public String[] getPassagier() {
        String ar[] = new String[3];
        ar[0] = name;
        ar[1] = nachname;
        ar[2] = geschl;
        return ar;
    }

    public String toString() {
        return "Passagier: " + name +
                " " + nachname;
    }

    public void geVerspaetet() {
        System.out.println(toString()+" hat sich verspaetet");
    }
}
