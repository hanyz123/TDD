package hyz.demo;
public class Bullion {
	private static final String UNIT_CM = "cm";
	private static final String UNIT_DM = "dm";
	private static final String UNIT_M = "m";
	/**
	 * 
	 * @param a 金条a长度
	 * @param b 金条b长度
	 * @param unit1 金条a长度单位
	 * @param unit2 金条b长度单位
	 * @return
	 */
	public String  checkLength(int a, int b , String unit1, String unit2) {
		int unit_m_a = 0;
		int unit_m_b = 0;
		if (unit1.equals(unit2)) {
			return  (a > b ? a : b) + unit1;			
		}
		if (UNIT_CM.equals(unit1)) {
			unit_m_a  = a;
		}
		if (UNIT_CM.equals(unit2)) {
			unit_m_b  = b;
		}
		if (UNIT_DM.equals(unit1)) {
			unit_m_a  = a * 10;
		}
		if (UNIT_DM.equals(unit2)) {
			unit_m_b  = b * 10;
		}
		if (UNIT_M.equals(unit1)) {
			unit_m_a  = a * 100;
		}
		if (UNIT_M.equals(unit2)) {
			unit_m_b  = b * 100;
		}
		if (unit_m_a > unit_m_b) {
			return a + unit1;
		}
		if (unit_m_a == unit_m_b) {
			return "金条长度相同";
		} else {
			return b + unit2;
		}
	}
}
