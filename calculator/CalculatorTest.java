package hyz.demo.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	/** 加法  */
	private static final int CALCULATOR_ADDITION = 0;
	/** 减法  */
	private static final int CALCULATOR_SUBTRACTION = 1;
	/** 乘法 */
	private static final int CALCULATOR_MULTIPLICATION = 2;
	/** 除法 */
	private static final int CALCULATOR_DIVISION = 3;
//	===================加法========================
	@Test
	public void should_return_0_input_0_addition_0 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_ADDITION, 0, 0);
		assertEquals("0", resultNum);
	}
	@Test
	public void should_return_1_input_1_addition_0 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_ADDITION, 1, 0);
		assertEquals("1", resultNum);
	}
	@Test
	public void should_return_15_input_3_addition_12 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_ADDITION, 3, 12);
		assertEquals("15", resultNum);
	}
	@Test
	public void should_return_2147483647_input_1_addition_2147483646 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_ADDITION, 1, 2147483646);
		assertEquals("2147483647", resultNum);
	}
	@Test
	public void should_return_2147483647_input_1_addition_2147483647 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_ADDITION, 1, 2147483647);
		assertEquals("大于最大值2147483647", resultNum);
	}
//	===================减法========================
	@Test
	public void should_return_0_input_0_subtraction_0 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_SUBTRACTION, 0, 0);
		assertEquals("0", resultNum);
	}
	@Test
	public void should_return_1_input_1_subtraction_0 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_SUBTRACTION, 1, 0);
		assertEquals("1", resultNum);
	}
	@Test
	public void should_return_26_input_35_subtraction_9 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_SUBTRACTION, 35, 9);
		assertEquals("26", resultNum);
	}
	@Test
	public void should_return_X_input_15_subtraction_20 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_SUBTRACTION, 15, 20);
		assertEquals("低于最小值0", resultNum);
	}
	
//	===================乘法========================
	@Test
	public void should_return_0_input_0_multiplication_0 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_MULTIPLICATION, 0, 0);
		assertEquals("0", resultNum);
	}
	@Test
	public void should_return_0_input_1_multiplication_0 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_MULTIPLICATION, 1, 0);
		assertEquals("0", resultNum);
	}
	@Test
	public void should_return_18_input_3_multiplication_6 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_MULTIPLICATION, 3, 6);
		assertEquals("18", resultNum);
	}
	@Test
	public void should_return_X_input_2147483647_multiplication_2 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_MULTIPLICATION, 2147483647, 2);
		assertEquals("大于最大值2147483647", resultNum);
	}
	
//	===================除法========================
	@Test
	public void should_return_X_input_0_division_0 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_DIVISION, 0, 0);
		assertEquals("被除数不得为零", resultNum);
	}
	@Test
	public void should_return_0_input_0_division_1 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_DIVISION, 0, 1);
		assertEquals("0.0", resultNum);
	}
	@Test
	public void should_return_X_input_1_division_2 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_DIVISION, 1, 2);
		assertEquals("0.5", resultNum);
	}
	@Test
	public void should_return_X2_input_1_division_3 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_DIVISION, 1, 3);
		assertEquals("0.33", resultNum);
	}
	@Test
	public void should_return_1_input_999_division_998 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_DIVISION, 999, 998);
		assertEquals("1.0", resultNum);
	}
	@Test
	public void should_return_1_input_998_division_999 () {
		Calculator calculator  = new Calculator();
		String resultNum = calculator.calculator(CALCULATOR_DIVISION, 998, 999);
		assertEquals("1.0", resultNum);
	}
}
