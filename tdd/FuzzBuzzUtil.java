package hyz.demo.tdd;

import java.util.ArrayList;
import java.util.List;

public class FuzzBuzzUtil {

	public List<String> getFizzBuzzList(int startNum, int endNum) {
		List<String> list = new ArrayList<>();
		for (int i = startNum; i <= endNum; i++) {
			if (i%15 == 0) {
				list.add("FizzBuzz");
			} else if (i%3 == 0) {
				list.add("Fizz");
			} else if (i%5 == 0) {
				list.add("Buzz");
			} else {
				list.add(String.valueOf(i));
			}
		}
		return list;
	}
	
}
