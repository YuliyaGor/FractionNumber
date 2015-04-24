package fractionNumber;

public class FractionNumber implements nedis.study.interfaces.t2.core.FractionNumber{

	private int divedent;
	private int divisor;
	
	public FractionNumber() {
		this.divisor = DEFAULT_DIVISOR_VALUE;
	}
	
	public FractionNumber (int dived, int divis) {
		setDividend(dived);
		setDivisor(divis);
	}
	
	public int getDividend() {
		return divedent;
	}

	public int getDivisor() {
		return divisor;
	}

	public void setDividend(int arg0) {
		this.divedent = arg0;
	}

	public void setDivisor(int arg0) throws IllegalArgumentException {
		if (arg0 == 0) {
			throw new IllegalArgumentException("Деление на ноль не возможно!");
		}else{
			this.divisor = arg0;
		}
		
	}

	public double value() {
		
		double result = (double) (this.divedent) / (double) (this.divisor);
		
		return result;
	}
	
	@Override
	public String toString() {
		return this.divedent + "/" + this.divisor;
	}
	

}
