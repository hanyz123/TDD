package hyz.demo.tdd;
import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;

public class FizzBuzzTest {
	@Test
	public void returnList_input_1To2 () {
		int startNum = 1;
		int endNum = 2;
		FuzzBuzzUtil fuzzBuzzUtil= new FuzzBuzzUtil();
		List resultFuzzBuzzList = fuzzBuzzUtil.getFizzBuzzList(startNum, endNum);
		assertEquals("1", resultFuzzBuzzList.toArray()[0]);
		assertEquals("2", resultFuzzBuzzList.toArray()[1]);
	}
	@Test
	public void returnList_input_1To100_1 () {
		int startNum = 1;
		int endNum = 100;
		FuzzBuzzUtil fuzzBuzzUtil= new FuzzBuzzUtil();
		List fuzzBuzzList = fuzzBuzzUtil.getFizzBuzzList(startNum, endNum);
		assertEquals("2", fuzzBuzzList.toArray()[1]);
	}
	@Test
	public void returnList_input_1To100_2 () {
		int startNum = 1;
		int endNum = 100;
		FuzzBuzzUtil fuzzBuzzUtil= new FuzzBuzzUtil();
		List fuzzBuzzList = fuzzBuzzUtil.getFizzBuzzList(startNum, endNum);
		assertEquals("Fizz", fuzzBuzzList.toArray()[2]);
	}
	@Test
	public void returnList_input_1To100_3 () {
		int startNum = 1;
		int endNum = 100;
		FuzzBuzzUtil fuzzBuzzUtil= new FuzzBuzzUtil();
		List fuzzBuzzList = fuzzBuzzUtil.getFizzBuzzList(startNum, endNum);
		assertEquals("Buzz", fuzzBuzzList.toArray()[4]);
	}
	@Test
	public void returnList_input_1To100_4 () {
		int startNum = 1;
		int endNum = 100;
		FuzzBuzzUtil fuzzBuzzUtil= new FuzzBuzzUtil();
		List fuzzBuzzList = fuzzBuzzUtil.getFizzBuzzList(startNum, endNum);
		assertEquals("FizzBuzz", fuzzBuzzList.toArray()[14]);
	}
}
