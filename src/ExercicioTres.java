import javax.swing.JOptionPane;

public class ExercicioTres {

	/**
	 * @param args
	 * @author Osvaldo Gusmao
	 */
	public static void main(String[] args) {

		int auxiliar;
		int numeroUm = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro nœmero"));
		int numeroDois = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo nœmero"));
		int numeroTres = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro nœmero"));

		if (numeroUm > numeroDois){
			auxiliar = numeroUm;
			numeroUm = numeroDois;
			numeroDois = auxiliar;
		}
		if (numeroUm > numeroTres) {
			auxiliar = numeroUm;
			numeroUm = numeroTres;
			numeroTres = auxiliar;
		}
		if (numeroDois > numeroTres) {
			auxiliar = numeroDois;
			numeroDois = numeroTres;
			numeroTres = auxiliar;
		}

		JOptionPane.showMessageDialog(null, "Os nœmeros em ordem crescentes s‹o : "+ numeroUm + ", "+ numeroDois + ", "  + numeroTres );

	}

}
