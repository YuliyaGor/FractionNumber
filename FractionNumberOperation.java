package fractionNumber;

import nedis.study.interfaces.t2.core.FractionNumber;

public class FractionNumberOperation implements
		nedis.study.interfaces.t2.core.FractionNumberOperation {

	public FractionNumber add(FractionNumber x, FractionNumber y)
			throws NullPointerException {

		int divident;
		int divisor;

		try {

			divident = x.getDividend() * y.getDivisor() + y.getDividend() * x.getDivisor();

		} catch (NullPointerException e) {
			throw e;
		}

		try {

			divisor = x.getDivisor() * y.getDivisor();

		} catch (NullPointerException e) {
			throw e;
		}

		FractionNumber fractionAdd = new fractionNumber.FractionNumber(
				divident, divisor);
		return fractionAdd;
	}

	public FractionNumber div(FractionNumber x, FractionNumber y)
			throws NullPointerException, ArithmeticException {
		int divident;
		int divisor;

		try {
			divident = x.getDividend() * y.getDivisor();
		} catch (NullPointerException e) {
			throw e;
		}

		try {
			divisor = x.getDivisor() * y.getDividend();
		} catch (NullPointerException e) {
			throw e;
		} catch (ArithmeticException e) {
			throw e;
		}
		
		FractionNumber fractionDiv = new fractionNumber.FractionNumber(
				divident, divisor);
		return fractionDiv;
	}

	public FractionNumber mul(FractionNumber x, FractionNumber y)
			throws NullPointerException {

		int divident;
		int divisor;

		try {

			divident = x.getDividend() * y.getDividend();

		} catch (NullPointerException e) {
			throw e;
		}

		try {

			divisor = x.getDivisor() * y.getDivisor();

		} catch (NullPointerException e) {
			throw e;
		}

		FractionNumber fractionMul = new fractionNumber.FractionNumber(
				divident, divisor);
		return fractionMul;

	}

	public FractionNumber sub(FractionNumber x, FractionNumber y)
			throws NullPointerException, ArithmeticException {

		int divident;
		int divisor;

		try {

			divident = x.getDividend() * y.getDivisor()	- y.getDividend() * x.getDivisor();

		} catch (NullPointerException e) {
			throw e;
		}

		try {

			divisor = x.getDivisor() * y.getDivisor();

		} catch (NullPointerException e) {
			throw e;
		}
		
		try {
			int result = divisor/divident;
		} catch (ArithmeticException e) {
			throw e; 
		}
		
		FractionNumber fractionSub = new fractionNumber.FractionNumber(
				divident, divisor);
		return fractionSub;

	}

}
