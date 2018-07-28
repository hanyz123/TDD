package hyz.demo;
enum EnumUnit {
	CM(1),
	DM(10),
	M(100);
	
	private int num;
	
	private EnumUnit(int num){
        this.num=num;
    }
	
	public int getNum(){
        return num;
    }
}
public class Bullion {
	/**
	 * 
	 * @param a 金条a长度
	 * @param b 金条b长度
	 * @param unit1 金条a长度单位
	 * @param unit2 金条b长度单位
	 * @return
	 */
	public String  checkLength(int a, int b , String unit1, String unit2) {
		int unit_m_a = getNum(unit1) * a;
		int unit_m_b = getNum(unit2) * b;
		if (unit_m_a == unit_m_b) {
			return "金条长度相同";
		} else {
			String unit = unit_m_a > unit_m_b ? unit1 : unit2;
			return  (unit_m_a > unit_m_b ? a : b) + unit;			
		}
	}
	
	public int getNum(String unit){
		switch (unit){
			case "cm":
				return EnumUnit.CM.getNum();
			case "dm":
				return EnumUnit.DM.getNum();
			case "m":
				return EnumUnit.M.getNum();
		default :
			return 0;
		}
	}
}
