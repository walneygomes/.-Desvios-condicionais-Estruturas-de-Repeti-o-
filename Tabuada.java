package condicionais;

public class Tabuada {
	public static final int UM = 1;
	public static final int DOIS = 2;
	public static final int TRES = 3;
	public static final int QUATRO = 4;
	public static final int CINCO = 5;
	public static final int SEIS = 6;
	public static final int SETE = 7;
	public static final int OITO = 8;
	public static final int NOVE = 9;
	public static final int DEZ = 10;

	public void printTabuada(int valor) {
		int[] valores = { UM * valor, DOIS * valor, TRES * valor, QUATRO * valor, CINCO * valor, SEIS * valor,
				SETE * valor, OITO * valor, NOVE * valor, DEZ * valor };
		for (int i = 1; i <= DEZ; i++) {
			System.out.println(valor + "x" + i + " = " + valores[i - 1]);
		}
	}

}
