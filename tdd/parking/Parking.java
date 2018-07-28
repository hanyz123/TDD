package hyz.demo.tdd.parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {
	// 停车场总车位
	int ParkingSpace;
	// 剩余车位	
	int ResiduaParkingSpace;
	List<String> list;
	/**
	 * 
	 * @param i 最大停车位
	 * @param j 剩余停车位
	 */
	public Parking(int i, int j) {
		ParkingSpace = i;
		ResiduaParkingSpace = j;
		list = new ArrayList<>();
	}
	/**
	 * 存车
	 * @param car
	 * @return
	 */
	public String parkingUp (String car) {
//		System.out.println("==剩余车位==" + ResiduaParkingSpace);
		if (ResiduaParkingSpace > 0) {
			list.add(car);
			ResiduaParkingSpace --;
			return "1";
		} else {
			return "0";
		}
	}
	/**
	 * 取车
	 * @param car
	 * @return
	 */
	public String pickUpCar(String car) {
		if (list.contains(car)) {
			ResiduaParkingSpace ++;
			return "1";
		}
		return "0";
	}
}
