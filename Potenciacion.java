public class Potenciacion {

	private int base;
	private int exponente;
	private float resultado;

	Potenciacion(int base, int exponente) {
		this.base = base;
		this.exponente = exponente;
	}

	private int multiplicar(int base, int exponente) {
		if (exponente == 1)
			return base;

		return base + multiplicar(base, exponente - 1);
	}

	private int calcular(int base, int exponente) {
		if (exponente == 0)
			return 1;

		if (exponente == 1)
			return base;

		return multiplicar(base, calcular(base, exponente - 1));
	}

	private float verificarBaseNegativa(int base, int exponente) {
		if (base < 0) {
			if (exponente % 2 != 0)
				return -calcular(-base, exponente);
			else
				return calcular(-base, exponente);
		}

		return calcular(base, exponente);
	}

	public String getPotenciacion() {
		try {
			if (exponente < 0) 
				return Float.toString(1 / verificarBaseNegativa(base, -exponente));

			return Float.toString(verificarBaseNegativa(base, exponente));

		} catch (StackOverflowError e) {
			return "Error: La potencia a calcular es demasiado grande";
		}
	}
}
