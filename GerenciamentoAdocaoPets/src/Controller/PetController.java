package Controller;

import View.TelaPet;
import Model.Pets.*;

public class PetController
{
	public static void main (String[]args)
	{
		TelaPet telaEntrada = new TelaPet();
		telaEntrada.consulta();
		String codigoP = telaEntrada.leitura();
		
		VerificaPet pet = new VerificaPet();
		
		
String mensagem = pet.verificaExistenciaPet(codigoP);
		
	telaEntrada.informaNome(mensagem);

	//String Adocao = pet.verificaStatusPet(codigoP);
	//telaEntrada.informaStatus(petPrincipal.getStatus());

		
	}

}