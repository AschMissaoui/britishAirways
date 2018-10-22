import java.util.ArrayList;

/**
 * @author Samuel
 * @version 8. Oktober 2018
 *
 *
*/

public class Flugzeug {
  private String modell;
  private int serienNr;
  private int flugStunden;
  private int tailNr;
  private Sitzplatz[] sitzplaetze;
  private ArrayList<Flug> fluege= new ArrayList<Flug>();
  
  public Flugzeug(String modell, int serienNr, int flugStunden, int tailNr, int sitzplatzAnzahl) {
    if(sitzplatzAnzahl <= 853) this.sitzplaetze = new Sitzplatz[sitzplatzAnzahl];


    
    this.modell = modell;
    this.serienNr = serienNr;
    this.flugStunden = flugStunden;
    this.tailNr = tailNr;
    System.out.println(this.toString()+" angelegt.");
  }
  
  public String getModell(){
    return modell;
  }
  
  public int getSerienNr(){
    return serienNr;
  }
  
  public int getFlugStunden(){
    return flugStunden;
  }
  
  public int getTailNr(){
    return tailNr;
  }
  
  public void setModell(String modell){
    this.modell = modell;
  }
  
  public void setSerienNr(int sn){
    this.serienNr = sn;
  }
  
  public void setFlugStunden(int fs){
    this.flugStunden = fs;
  }
  
  public void setTailNr(int tn){
    this.tailNr = tn;
  }

  public void addFlug(Flug f){
    fluege.add(f);
  }
  
  public void heizen(){
    System.out.println(toString()+ " wird geheizt.");
  }
  
  public void einstellen(){
    System.out.println(toString()+ " wird eingestellt.");
  }
  
  public void auftanken(){
    System.out.println(toString()+ " wird aufgetankt.");
  }
  
  public void saeubern(){
    System.out.println(toString()+ " wird gesaeubert.");
  }
  
  public void enteisen(){
    System.out.println(toString()+ " wird enteist.");
  }
  
  public void reparieren(){
    System.out.println(toString()+ " wird repariert.");
  }
  
  /** 
  * nicht gefragt, nur zum testen gedacht
  */
  public String toStringDetailed(){
    return "modell: "+modell+"; serienNr: "+serienNr
    +"; flugStunden: "+flugStunden+"; tailNr: "+tailNr
    +"; Anzahl sitzplaetze: "+sitzplaetze.length;
  }
  
  public String toString(){
    return "Flugzeug "+serienNr;
  }
  
}
