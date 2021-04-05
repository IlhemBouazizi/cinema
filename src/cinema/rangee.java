package cinema;

public class rangee 
{
	private int nb_sieges_total;
	private int nb_sieges_libres;	
	private siege[] tableau_sieges;
	
	rangee(int valeur_initiale)
	{
		nb_sieges_total = valeur_initiale;
		nb_sieges_libres = valeur_initiale;	
		tableau_sieges = new siege[nb_sieges_total];
		for(int i = 0; i < nb_sieges_total ; i++)
		{
			tableau_sieges[i] = new siege();
		}
	}
	
	public void afficher()
	{
		for (int i = 0; i < nb_sieges_total; i++) 
		{
			tableau_sieges[i].afficher();
		}
	}
	
	public boolean reserver(int nb_sieges_a_reserver)
	{
		boolean return_value = false;
		int reste_a_reserver;
		int compteur;
		
		if (nb_sieges_a_reserver > nb_sieges_libres)
		{
			return_value = false;
		}
		else
		{
			return_value = true;
			nb_sieges_libres -= nb_sieges_a_reserver;
			reste_a_reserver = nb_sieges_a_reserver;
			compteur = 0;
			System.out.print("[>] Reservation de(s) place(s) :");
			while ((reste_a_reserver > 0) && (compteur < nb_sieges_total))
			{
				if(tableau_sieges[compteur].siege_libre())
				{
					tableau_sieges[compteur].reserver();					
					reste_a_reserver--;
					System.out.print((compteur + 1) + " ");
				}				
				compteur++;				
			}			
		}			
		
		return return_value;
	}

}
