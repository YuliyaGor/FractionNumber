package fractionNumber;

public class FractionMain {

	public static void main(String[] args) {
		FractionNumber frNum1 = new FractionNumber(1, 8);
		FractionNumber frNum2 = new FractionNumber(1, 8);
			
		FractionNumberOperation frOper = new FractionNumberOperation();
		nedis.study.interfaces.t2.core.FractionNumber frNumAdd;
		nedis.study.interfaces.t2.core.FractionNumber frNumSub;
		
		try {
			frNumAdd = frOper.add(null, frNum2);
		} catch (NullPointerException e) {
			System.out.println("Null при операции сложения");
			frNumAdd = frOper.add(frNum1, frNum2);
		}
		
		try {
			frNumSub = frOper.sub(frNum1, frNum2);
		} catch (NullPointerException e) {
			System.out.println("Null при операции вычитания");
			frNumSub = frOper.sub(frNum1, frNum2);
		} catch (ArithmeticException e) {
			System.out.println("После вычитания делимое = НОЛЬ!");
			FractionNumber frNumX = new FractionNumber(1, 8);
			FractionNumber frNumY = new FractionNumber(3, 8);
			frNumSub = frOper.sub(frNumX, frNumY);
		}
		
		nedis.study.interfaces.t2.core.FractionNumber frNumDiv = frOper.div(frNum1, frNum2);
		nedis.study.interfaces.t2.core.FractionNumber frNumMul = frOper.mul(frNum1, frNum2);
		
		
		System.out.println(frNum1.toString() + " + " + frNum2.toString() + " = " + frNumAdd.toString() + " = " + frNumAdd.value());
		System.out.println(frNum1.toString() + " - " + frNum2.toString() + " = " + frNumSub.toString() + " = " + frNumSub.value());
		System.out.println(frNum1.toString() + " : " + frNum2.toString() + " = " + frNumDiv.toString() + " = " + frNumDiv.value());
		System.out.println(frNum1.toString() + " * " + frNum2.toString() + " = " + frNumMul.toString() + " = " + frNumMul.value());
	}

}
