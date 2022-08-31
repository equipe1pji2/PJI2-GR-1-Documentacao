package View;

import javax.swing.JOptionPane;

public class TelaPet 
{
	public void consulta()
	{
		JOptionPane.showMessageDialog(null, "\nConsulta de Adocoes");
	}
	
	public String leitura()
	{
		String codPet = JOptionPane.showInputDialog("Digite o codigo do pet");
		 
		 return codPet;
	}
	
	public void informaNome(String nomePet)
	{
		JOptionPane.showMessageDialog(null,"\nNome do pet: " +nomePet );
	}
	public void informaStatus(String statusAdocao)
	{
		JOptionPane.showMessageDialog(null,"\n Status: " +statusAdocao );
	}
}