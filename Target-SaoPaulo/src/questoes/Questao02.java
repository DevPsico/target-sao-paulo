package questoes;

public class Questao02 {

	public static boolean eFibonacci(int num) {

		if (num == 0 || num == 1) {
			return true;
		}

		int a = 0, b = 1, c;

		while (b <= num) {
			c = a + b;
			a = b;
			b = c;

			if (b == num) {
				return true;
			}
		}
		return false;
	}
}