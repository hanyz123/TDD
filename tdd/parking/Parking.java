package hyz.demo.tdd.parking;

public class Parking {
	public String parkingUtil (String carStorage, int parkingSpaceAllNum) {
		if (parkingSpaceAllNum > 0) {
			return "1";
		} else {
			return "0";			
		}
	}
}
