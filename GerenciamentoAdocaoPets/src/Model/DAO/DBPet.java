package Model.DAO;

public class DBPet 
{
	String codPet1 = "1";
	String codPet2 = "2";
	String codPet3 = "3";
	String codPet4 = "4";
	public String statusAdocao;
	
/*/
	public Enum StatusAdocao
	{
		APROVADO, EM_ANÁLISE, NEGADO;
	} 
/*/
	
	public String acessaDBPet(String codPet)
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
				statusAdocao = "Em Análise";
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
						statusAdocao = "Em Análise";
					}
					else
					{
						nomePet = "Código Inválido";
					}
				}
				
			}
			
		}
		return nomePet;
	}

}
