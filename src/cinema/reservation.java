package cinema;

import java.util.Scanner;

public class reservation {	
	final static int Nb_rangees = 8;
	final static int Nb_sieges  = 9;	
	private static salle ma_salle = new salle(Nb_rangees, Nb_sieges);
	
	

	public static void main(String[] args) 
	{
		boolean continuer = true;
		String decision;
		Scanner sc;
		
		ma_salle.afficher();
		
		while(continuer)
		{			
			ma_salle.reserver();
			ma_salle.afficher();								
			System.out.print("\n[+] Voulez vous continuer (O) ? ");
			sc = new Scanner(System.in);
			decision = sc.nextLine();
			switch(decision)
		    {
		        case "O":
		        case "o":
		        continuer = true;
		            break;

		        default:
		        	continuer = false;
		            break;
		    }
		}		
	}
}
