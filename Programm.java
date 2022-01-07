import java.util.Scanner;

public class Programm 
{

	public static void main(String[] args) 
	{
		Getr�nke colazero = new Getr�nke("colazero","coca cola" , "cola" , 1);
		Getr�nke fanta = new Getr�nke("fanta","fantasia" , "orange" , 2);
		Getr�nke himbeersaft = new Getr�nke("himbeersaft","heinrichs beste himbeeren" , "himbeere", 3);
		Getr�nke wasser = new Getr�nke("wasser","Wiener Wasser" , "puren", 4);
		
		colazero.setPreis(2);
		fanta.setPreis(3);
		himbeersaft.setPreis(1);
		
		System.out.print("1 Colazero  ");
		System.out.print("2 Fanta  ");
		System.out.print("3 Himbeersaft  ");
		System.out.println("4 Wasser  ");
		System.out.print("W�hlen sie eine Nummer : ");
		
		
		Scanner scan = new Scanner(System.in);
		int automatNummer = scan.nextInt();
		
			
		switch(automatNummer) 
		{
		case 1: colazero.preisangabe();
				int geldEingabe1 = scan.nextInt();
				
				if(geldEingabe1 >= colazero.getPreis()) 
				{
					
					colazero.ausgabe();
					rechnermaschine(geldEingabe1, colazero.getPreis());
					
				}
				else
				{
					int fehlendGeld = colazero.getPreis() - geldEingabe1;
					
					
					System.out.println("es fehlt noch " + fehlendGeld + "�");
				}
				break;
				
		case 2: fanta.preisangabe();	
				int geldEingabe2 = scan.nextInt();
				
				if(geldEingabe2 >= fanta.getPreis()) 
				{
					fanta.ausgabe();
					rechnermaschine(geldEingabe2, fanta.getPreis());
					
				}
				else
				{
					int fehlendGeld = fanta.getPreis() - geldEingabe2;
					
					
					System.out.println("es fehlt noch " + fehlendGeld + "�");
				}
				break;
				
		case 3: himbeersaft.preisangabe();
				int geldEingabe3 = scan.nextInt();
				
				if(geldEingabe3 >= himbeersaft.getPreis())
				{
					himbeersaft.ausgabe();
					rechnermaschine(geldEingabe3, himbeersaft.getPreis());
				}
				else
				{
					int fehlendGeld = himbeersaft.getPreis() - geldEingabe3;
					
					
					System.out.println("es fehlt noch " + fehlendGeld + "�");
				}
				break;
		
		case 4: wasser.preisangabe();
				int geldEingabe4 = scan.nextInt();
		
				if(geldEingabe4 >= wasser.getPreis())
				{
					wasser.ausgabe();
					rechnermaschine(geldEingabe4, wasser.getPreis());
				}
				else
				{
					int fehlendGeld = wasser.getPreis() - geldEingabe4;
					
					
					System.out.println("es fehlt noch " + fehlendGeld + "�");
				}
				break;
		
		case (5-100): System.out.println("nummer ned verf�gbar");
				break;
				
		default: System.out.println("bissste pleeeite boi");		
				break;
		}
		

	}

	public static int rechnermaschine(int geld, int preis) 
	{
		int restgeld = geld - preis;
		System.out.println("Ihr Restgeld von " + restgeld + " � befindet sich im beh�lter");
		return restgeld;
		
	}
}

