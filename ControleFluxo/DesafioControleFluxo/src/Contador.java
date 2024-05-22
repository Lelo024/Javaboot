
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		

		try {
			//chamando o método contendo a lógica de contagem
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
			
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
		int interacoes = parametroDois - parametroUm;
		for (int i = 1; i <= interacoes; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	} catch (ParametrosInvalidosException e) {
		System.err.println("Erro: " + e.getMessage());
	}
}
}
// Classe de exceção customizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}