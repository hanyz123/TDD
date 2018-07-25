package hyz.demo.tdd.parking;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class ParkingTest {
	/** 停车 */
	private static final String CAR_STORAGE = "0";
	/** 取车 */
	private static final String CAR_PICK_UP = "1";
	@Test
	public void should_return_0_input_ () {
		Parking parking = new Parking();
		assertEquals("1", parking.parkingUtil(CAR_STORAGE));
	}
}
