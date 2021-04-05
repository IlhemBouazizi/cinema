package cinema;

public class siege 
{
	private boolean est_libre;
	
	siege()
	{
		est_libre = true;
	}
	
	public void afficher()
	{
		if (est_libre)
		{
			System.out.print("[_]");
		}
		else
		{
			System.out.print("[X]");
		}
	}
	
	
	public boolean siege_libre()
	{
		return est_libre;		
	}
	
	public void reserver()
	{
		est_libre = false;		
	}	
}
