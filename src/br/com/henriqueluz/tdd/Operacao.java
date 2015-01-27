package br.com.henriqueluz.tdd;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Operacao {

	public static BigDecimal fatorial(Integer n) {
		if (n < 0) {
			return null;
		} else if (n > 1) {
			BigDecimal[] vet = new BigDecimal[n + 1];
			vet[0] = vet[1] = new BigDecimal("1");
			for (int i = 2; i <= n; i++) {
				vet[i] = vet[i - 1].multiply(new BigDecimal(i));
			}
			return vet[n];
		}
		return BigDecimal.ONE;
	}

	public static BigDecimal calculaSerieDeTaylor(int n) {
		BigDecimal e = BigDecimal.ONE;

		if (n <= 0) {
			return BigDecimal.ZERO;
		} else {
			for (int i = 1; i < n; i++) {
				e = e.add(BigDecimal.ONE.divide(fatorial(i), 20,
						RoundingMode.UP));
			}
		}
		return e;
	}
}
