package cinema;

import java.util.Scanner;

public class salle {
	private static int Nb_rangees;
	private static int Nb_sieges;
	private static rangee[] tableau_rangees;
	
	salle(int rangees, int sieges)
	{
		Nb_rangees = rangees;
		Nb_sieges = sieges;	
		
		tableau_rangees = new rangee[Nb_rangees];
		for(int i = 0; i < Nb_rangees ; i++)
		{
			tableau_rangees[i] = new rangee(Nb_sieges);
		}
	}	
	
	public void afficher()
	{
		System.out.print("\n ======= Plan de la salle =======");
		System.out.print("\n   ");
		for (int i = 0; i < Nb_sieges; i++) 
		{
			System.out.print("[" + (i+1) + "]");
		}
		for (int i = 0; i < Nb_rangees; i++) 
		{
			System.out.print("\n[" + (i+1) + "]");
			tableau_rangees[i].afficher();
		}
		System.out.print("\n ================================");				
	}
	
	public void reserver()
	{
		Scanner sc;
		int la_rangee, nb_sieges_a_reserver;
				
		System.out.print("\n[+] Saisir la rangée dans laquelle vous veulez être placés : ");
		sc = new Scanner(System.in);
		la_rangee = sc.nextInt();
		
		System.out.print("[+] Saisir le nombre de places à réserver : ");
		sc = new Scanner(System.in);
		nb_sieges_a_reserver = sc.nextInt();		
		
		if(tableau_rangees[(la_rangee - 1)].reserver(nb_sieges_a_reserver) == true)
		{
			System.out.print("\n[+] Reservation effectué avec succée :)");
		}
		else
		{
			System.out.print("[+] Reservation non possible dans cette rangée :(");
		}	    
		
	}

}
