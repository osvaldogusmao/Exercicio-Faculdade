import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class ExercicioUm {

	/**
	 * @param args
	 * @author Osvaldo Gusm�o
	 */
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy");
		
		int anoAtual = Integer.parseInt(formatDate.format(calendar.getTime()));
		
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano em que vc nasceu "));
		
		int idade = anoAtual - anoNascimento;
		
		JOptionPane.showMessageDialog(null, "Voc� tem ou ir� fazer " + idade + " ano(s). " );
		
	}

}
