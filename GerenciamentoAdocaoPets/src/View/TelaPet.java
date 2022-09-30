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
	
	public void informaNome(String mensagem)
	{
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
}