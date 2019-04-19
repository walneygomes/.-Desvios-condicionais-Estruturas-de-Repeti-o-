package condicionais;

import java.util.Scanner;
/**
 *
 * @author Walney Negreiros
 */
public class AppProgram {
	public static void main(String[] argumentos) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite 2 para tabuada ou 1 para sequencia");
		String opcao = teclado.nextLine();
		if (opcao.equals("1")) {
			System.out.println("numero de partida");
			int partida = teclado.nextInt();
			System.out.println("numero de chegada");
			int limite = teclado.nextInt();
			Sequencia s = new Sequencia();
			s.printSequencia(partida, limite);

		} else if (opcao.equals("2")) {
			System.out.println("Qual tabuada voce quer?");
			int numero = teclado.nextInt();
			Tabuada t = new Tabuada();
			t.printTabuada(numero);

		} else {
			System.err.println("opcao invalida");
		}
	}

}
