import java.util.Scanner;

public class Programm 
{

	public static void main(String[] args) 
	{
		Getränke colazero = new Getränke("colazero","coca cola" , "cola" , 1);
		Getränke fanta = new Getränke("fanta","fantasia" , "orange" , 2);
		Getränke himbeersaft = new Getränke("himbeersaft","heinrichs beste himbeeren" , "himbeere", 3);
		Getränke wasser = new Getränke("wasser","Wiener Wasser" , "puren", 4);
		
		colazero.setPreis(2);
		fanta.setPreis(3);
		himbeersaft.setPreis(1);
		
		System.out.print("1 Colazero  ");
		System.out.print("2 Fanta  ");
		System.out.print("3 Himbeersaft  ");
		System.out.println("4 Wasser  ");
		System.out.print("Wählen sie eine Nummer : ");
		
		
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
					
					
					System.out.println("es fehlt noch " + fehlendGeld + "€");
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
					
					
					System.out.println("es fehlt noch " + fehlendGeld + "€");
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
					
					
					System.out.println("es fehlt noch " + fehlendGeld + "€");
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
					
					
					System.out.println("es fehlt noch " + fehlendGeld + "€");
				}
				break;
		
		case (5-100): System.out.println("nummer ned verfügbar");
				break;
				
		default: System.out.println("bissste pleeeite boi");		
				break;
		}
		

	}

	public static int rechnermaschine(int geld, int preis) 
	{
		int restgeld = geld - preis;
		System.out.println("Ihr Restgeld von " + restgeld + " € befindet sich im behälter");
		return restgeld;
		
	}
}

