package day12;

/**
 * 
 * @author unascribed
 * @since JDK 8
 * <br>Calculator
 * @version 1.0
 */



public class Calc {
	/**
	 * To add the following numbers.<br>
	 * @param num1 : First Integer for add
	 * @param num2 : Last Integer for add
	 * @return value(int type)
	 * @see Math
	 */
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
	/**
	 * To divide the following numbers.<br>
	 * @param num1 : First Integer for div
	 * @param num2 : Last Integer for div
	 * @return value(int type)
	 * @throws ArithmeticException
	 * @see Math
	 */
	public int div(int num1, int num2) {
		return num1/num2;
	}
}
