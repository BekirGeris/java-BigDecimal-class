package Bolum_10_Soru_20;

import java.math.BigDecimal;
import java.math.BigInteger;

public class eHesaplaBigDecimal {

	public static void main(String[] args) {

		String faktS = "5";
		BigDecimal e = BigDecimal.ONE;

		for (BigInteger i = BigInteger.ONE; !i.equals(faktS); i = i.add(BigInteger.ONE)) {
			BigDecimal f = new BigDecimal(fact(i));
			e.add(BigDecimal.ONE.divide(f));
		}
		System.out.println(e);

	}

	public static String fact(BigInteger i) {
		BigInteger result = BigInteger.ONE;
		BigInteger temp = BigInteger.ZERO;
		System.out.println(i);
		for (; !i.equals(temp); i = i.subtract(BigInteger.ONE)) {
			result = result.multiply(i);
		}
		System.out.println(result);
		return result.toString();
	}

}
