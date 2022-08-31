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
		
		
String nome = pet.verificaExistenciaPet(codigoP);
		
	telaEntrada.informaNome(nome);

	String Adocao = pet.verificaStatusPet(codigoP);
	telaEntrada.informaStatus(Adocao);

		
	}

}