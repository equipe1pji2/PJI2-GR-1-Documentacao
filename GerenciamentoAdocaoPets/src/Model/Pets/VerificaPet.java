package Model.Pets;

import Model.DAO.DBPet;

public class VerificaPet
{
	public String verificaExistenciaPet(String codPet) {
		   boolean existePet=false;
		   DBPet dbPet = new DBPet();
		   
		   String nomePet = dbPet.acessaDBPet(codPet);
		   
		   return nomePet;
		   
		   

	}
	public String verificaStatusPet(String codPet) {
		  boolean existePet=false;
		   DBPet dbPet = new DBPet();
		   
		   String statusAdocao = dbPet.acessaDBPet(codPet);
		   
		   return dbPet.statusAdocao;
}
}
