import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class ExercicioDois {

	/**
	 * @param args
	 * @author Osvaldo Gusmao
	 */
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy");
		
		int anoAtual = Integer.parseInt(formatDate.format(calendar.getTime()));
		
		String nomeAluno = JOptionPane.showInputDialog("Insira seu nome");
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano em que vc nasceu "));
		
		int idade = anoAtual - anoNascimento;
		
		if (idade >= 18) {
			JOptionPane.showMessageDialog(null, "Seja bem-vindo " + nomeAluno + ".\nVocê está apto a tirar sua CNH." );
		}else {
			JOptionPane.showMessageDialog(null, "Seja bem-vindo " + nomeAluno + ".\nVocê não está apto a tirar sua CNH." );
		}
		
	}

}
