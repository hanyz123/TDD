package hyz.demo;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class BullionTest {
	@Test
	public void should_return_2_input_1_2_mm () {
		int aLen = 1;
		String unit1 = "mm";
		int bLen = 2;
		String unit2 = "mm";
		Bullion bullion = new Bullion();
		String  result = bullion.checkLength(aLen, bLen, unit1, unit2);
		assertEquals("2mm", result);
	}
	@Test
	public void should_return_2_input_1_2_m () {
		int aLen = 1;
		String unit1 = "mm";
		int bLen = 2;
		String unit2 = "mm";
		Bullion bullion = new Bullion();
		String  result = bullion.checkLength(aLen, bLen, unit1, unit2);
		assertEquals("2mm", result);
	}
	
	@Test
	public void should_return_1m_input_1m_2cm () {
		int aLen = 1;
		String unit1 = "m";
		int bLen = 2;
		String unit2 = "cm";
		Bullion bullion = new Bullion();
		String  result = bullion.checkLength(aLen, bLen, unit1, unit2);
		assertEquals("1m", result);
	}
	@Test
	public void should_return_2m_input_2m_2dm () {
		int aLen = 2;
		String unit1 = "m";
		int bLen = 2;
		String unit2 = "dm";
		Bullion bullion = new Bullion();
		String  result = bullion.checkLength(aLen, bLen, unit1, unit2);
		assertEquals("2m", result);
	}
	@Test
	public void should_return_2m_input_2m_20dm () {
		int aLen = 2;
		String unit1 = "m";
		int bLen = 20;
		String unit2 = "dm";
		Bullion bullion = new Bullion();
		String  result = bullion.checkLength(aLen, bLen, unit1, unit2);
		assertEquals("金条长度相同", result);
	}
	@Test
	public void should_return_2m_input_2m_30dm () {
		int aLen = 2;
		String unit1 = "m";
		int bLen = 30;
		String unit2 = "dm";
		Bullion bullion = new Bullion();
		String  result = bullion.checkLength(aLen, bLen, unit1, unit2);
		assertEquals("30dm", result);
	}
	@Test
	public void should_return_2dm_input_2dm_2cm () {
		int aLen = 2;
		String unit1 = "dm";
		int bLen = 2;
		String unit2 = "cm";
		Bullion bullion = new Bullion();
		String  result = bullion.checkLength(aLen, bLen, unit1, unit2);
		assertEquals("2dm", result);
	}
}
