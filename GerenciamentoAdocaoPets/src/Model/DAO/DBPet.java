package Model.DAO;

import Model.Pets.Pet;

public class DBPet 
{
	String codPet1 = "1";
	String codPet2 = "2";
	String codPet3 = "3";
	String codPet4 = "4";
	public String statusAdocao;
	Pet dbPet = new Pet(); 
/*/
	public Enum StatusAdocao
	{
		APROVADO, EM_AN�LISE, NEGADO;
	} 
/*/
	
	public Pet acessaDBPet(String codPet)
	{
		String nomePet;
		
		if (codPet.equals(codPet1)) 
		{
			nomePet = "Alexia";
			statusAdocao = "Aprovado";
		} 
		else 
		{
			if (codPet.equals(codPet2))
			{
				nomePet = "Ana";
				statusAdocao = "Em An�lise";
			} 	
			else
			{
				if (codPet.equals(codPet3))
				{
					nomePet = "Julia";
					statusAdocao = "Negado";
				} 
				else
				{
					if (codPet.equals(codPet4))
					{
						nomePet = "Lola";
						statusAdocao = "Em An�lise";
					}
					else
					{
						nomePet = "C�digo Inv�lido";
					}
				}
				
			}
			
		}
		dbPet.setNome(nomePet);
		dbPet.setStatus(statusAdocao);
		dbPet.setRaca("Lulu da Pomerânia");
		dbPet.setIdade(2);
		return dbPet;
		
	}

}
