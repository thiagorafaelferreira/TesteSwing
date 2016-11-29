package aplicacao;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Aplicacao {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Minha mensagem!");
		JFileChooser fileChooser = new JFileChooser();
		int retorno = fileChooser.showOpenDialog(null);
		if (retorno == JFileChooser.APPROVE_OPTION) {
			System.out.println("selecionou arquivo");
			  File file = fileChooser.getSelectedFile();
			  // faz alguma coisa com arquivo
			} else {
				System.out.println(retorno);
				System.out.println("não selecionou arquivo");
			}

	}
	
}
