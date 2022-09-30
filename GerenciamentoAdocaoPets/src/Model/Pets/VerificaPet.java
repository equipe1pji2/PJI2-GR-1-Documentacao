package Model.Pets;

import Model.DAO.DBPet;
import Model.Pets.Pet;
public class VerificaPet
{
	public String verificaExistenciaPet(String codPet) {
		   boolean existePet=false;
		   
		   Pet meuPet = new Pet();
		   
		   DBPet dbPets = new DBPet();
		   
		   //String nomePet = dbPet.acessaDBPet(codPet);
		   meuPet = dbPets.acessaDBPet(codPet);
		   System.out.println("O nome do pet é: " +meuPet.getNome());
		   String mensagem = "O nome do pet é: " +meuPet.getNome() + "\nO status da adoção é: " +meuPet.getStatus();
		   return mensagem;
		   
		   

	}
	/*/
	public String verificaStatusPet(String codPet) {
		  boolean existePet=false;
		   DBPet dbPet = new DBPet();
		   
		   String statusAdocao = dbPet.acessaDBPet(codPet);
		   
		   return dbPet.statusAdocao;
} /*/
	
}
