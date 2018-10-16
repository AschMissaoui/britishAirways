/**
 * @author  Marc Nauendorf
 * @version 6. Oktober 2018
 */

public class Pilot{
	
	private String name;
	private int persNummer;
	private Fluglinie fluglinie;
	private Flug flug;
	

	public Pilot(String name, int persNummer, Fluglinie fluglinie, Flug flug) {
		this.name = name;
		this.persNummer = persNummer;
		System.out.println(toString() + " angelegt.");
		this.fluglinie = fluglinie;
		this.flug=flug;

	}


	public String getName() {
		return name;
	}

	public Fluglinie getFluglinie() { return fluglinie; }

	public Flug getFlug() { return flug; }

	public void setFlug(Flug flug){ this.flug=flug;}

	public void setFluglinie(Fluglinie fluglinie){this.fluglinie=fluglinie;}

	public void setName(String name) {
		this.name = name;
	}


	public int getPersNummer() {
		return persNummer;
	}


	public void setPersNummer(int persNummer) {
		this.persNummer = persNummer;
	}
	
	public String toString() {
		return "Pilot [name=" + name + ", Personalnummer=" + persNummer + "]";
	}

	public void verspaeten(){
		System.out.println(toString()+ " verspaetet sich.");
	}

	public void entlassen(){
		System.out.println(toString()+ " wird entlassen.");
	}

	public void einstellen(){
		System.out.println(toString()+ " wird eingestellt.");
	}
	

	
	

}
