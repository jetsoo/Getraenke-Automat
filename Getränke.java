
public class Getr�nke 
{
	
	private String name;
	private String marke;
	private String geschmack;
	private int preis;
	private int nummer;
	
	public Getr�nke(String name, String marke, String geschmack, int nummer) 
	{
		this.name = name;
		this.marke = marke;
		this.geschmack = geschmack;
		this.nummer = nummer;
	}
	
	public void ausgabe() 
	{
		System.out.println("ihr getr�nk von "+ marke +" wurde ausgegeben");
	}

	public void preisangabe()
	{
		System.out.println("danke das sie " + name + " ausgew�hlt haben, ihr getr�nk kostet " + preis + "�");
		System.out.println("werfen sie geld ein um den besten " + geschmack + "geschmack zu haben");
	}
	
	public String getMarke() {
		return marke;
	}

	public void setMarke(String marke) {
		this.marke = marke;
	}

	public String getGeschmack() {
		return geschmack;
	}

	public void setGeschmack(String geschmack) {
		this.geschmack = geschmack;
	}

	public int getPreis() {
		return preis;
	}

	public void setPreis(int preis) {
		this.preis = preis;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	
	
}
