package hyz.demo.calculator;

import java.math.BigDecimal;

public class Calculator {
	/** 加法  */
	private static final int CALCULATOR_ADDITION = 0;
	/** 减法  */
	private static final int CALCULATOR_SUBTRACTION = 1;
	/** 乘法 */
	private static final int CALCULATOR_MULTIPLICATION = 2;
	/** 除法 */
	private static final int CALCULATOR_DIVISION = 3;
	
	private static final BigDecimal NUMBER_MAX= new BigDecimal(Integer.MAX_VALUE);
	private static final BigDecimal NUMBER_MIN= BigDecimal.ZERO;
	
	/**
	 * 
	 * @param type 算法类型
	 * @param startNum 算法前面数据
	 * @param endNum 算法后面数据
	 * @return
	 */
	public String calculator (int type, int startNum, int endNum) {
		BigDecimal startNumBigDecimal = new BigDecimal(Integer.toString(startNum));
		BigDecimal endNumBigDecimal = new BigDecimal(Integer.toString(endNum));
		if (CALCULATOR_ADDITION == type) {
			BigDecimal resultB = startNumBigDecimal.add(endNumBigDecimal);
			if (resultB.compareTo(NUMBER_MAX) > 0) {
				return "大于最大值2147483647";
			} else {
				return resultB.toString();
			}
		} else if (CALCULATOR_SUBTRACTION == type) {
			BigDecimal resultB = startNumBigDecimal.subtract(endNumBigDecimal);
			if (resultB.compareTo(NUMBER_MIN) < 0) {
				return "低于最小值0";
			} else {
				return resultB.toString();
			}
		} else if (CALCULATOR_MULTIPLICATION == type) {
			BigDecimal resultB = startNumBigDecimal.multiply(endNumBigDecimal);
			if (resultB.compareTo(NUMBER_MAX) > 0) {
				return "大于最大值2147483647";
			} else {
				return resultB.toString();
			}
		} else if (CALCULATOR_DIVISION == type) {
			if (endNumBigDecimal.compareTo(BigDecimal.ZERO) == 0) {
				return "被除数不得为零";
			}
			BigDecimal resultB = startNumBigDecimal.divide(endNumBigDecimal, 2,  BigDecimal.ROUND_HALF_DOWN);
			return String.valueOf(resultB.doubleValue());
		} else {
			return "计算方式有误";
		}
	}
}
