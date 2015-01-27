package br.com.henriqueluz.tdd;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

public class OperacaoTest {

	@Test
	public void deveriaRetornarFatorialNulo() {
		assertNull(Operacao.fatorial(-10));
	}

	@Test
	public void deveriaRetornarUm() {
		assertEquals(new BigDecimal(1), Operacao.fatorial(0));
		assertEquals(new BigDecimal(1), Operacao.fatorial(1));
	}

	@Test
	public void deveriaRetornarFatorialDeDois() {
		assertEquals(new BigDecimal(2), Operacao.fatorial(2));
	}

	@Test
	public void deveriaRetornarFatorialDeTres() {
		assertEquals(new BigDecimal(6), Operacao.fatorial(3));
	}

	@Test
	public void deveriaRetornarFatorialDeCinco() {
		assertEquals(new BigDecimal(120), Operacao.fatorial(5));
	}

	@Test
	public void deveriaRetornarFatorialDeDez() {
		assertEquals(new BigDecimal(3628800), Operacao.fatorial(10));
	}

	@Test
	public void deveriaRetornarZeroParaValorNegativo() {
		assertEquals(BigDecimal.ZERO, Operacao.calculaSerieDeTaylor(-20));
	}

	@Test
	public void deveriaRetornarSerieDeZero() {
		assertEquals(BigDecimal.ZERO, Operacao.calculaSerieDeTaylor(0));
	}

	@Test
	public void deveriaRetornarSerieDeUm() {
		assertEquals(BigDecimal.ONE, Operacao.calculaSerieDeTaylor(1));
	}

	@Test
	public void deveriaRetornarSerieDeDois() {
		assertEquals(new BigDecimal("2").setScale(20),
				Operacao.calculaSerieDeTaylor(2));
	}

	@Test
	public void deveriaRetornarSerieDeTres() {
		assertEquals(new BigDecimal("2.5").setScale(20),
				Operacao.calculaSerieDeTaylor(3));
	}

	@Test
	public void deveriaRetornarSerieDe4() {
		assertEquals(new BigDecimal("2.66666666666666666667"),
				Operacao.calculaSerieDeTaylor(4));
	}

}
