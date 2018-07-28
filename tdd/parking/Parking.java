package hyz.demo.tdd.parking;

public class Parking {
	int ParkingSpace = 0;
	public Parking(int i) {
		ParkingSpace = i;
	}


	public String parkingUtil (String carStorage, int parkingSpaceAllNum) {
		if (parkingSpaceAllNum > 0) {
			return "1";
		} else {
			return "0";			
		}
	}
}
