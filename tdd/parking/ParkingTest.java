package hyz.demo.tdd.parking;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class ParkingTest {
	@Test
	public void should_return_0_input_parkingUp () {
		Parking parking = new Parking(10, 0);
		String myCar = "0001";
		assertEquals("0", parking.parkingUp(myCar));
	}
	@Test
	public void should_return_0_input_pickUpCar () {
		Parking parking = new Parking(10, 0);
		String myCar1 = "0001";
		assertEquals("0", parking.pickUpCar(myCar1));
	}
	@Test
	public void should_return_1_input_parkingUp () {
		Parking parking = new Parking(10, 1);
		String myCar = "0001";
		assertEquals("1", parking.parkingUp(myCar));
		String myCar1 = "0001";
		assertEquals("1", parking.pickUpCar(myCar1));
	}
	@Test
	public void should_return_1_input_parkingUp_1 () {
		Parking parking = new Parking(10, 1);
		String myCar = "0001";
		assertEquals("1", parking.parkingUp(myCar));
		String myCar1 = "0002";
		assertEquals("0", parking.parkingUp(myCar1));
		String myCar2 = "0001";
		assertEquals("1", parking.pickUpCar(myCar2));
		String myCar3 = "0002";
		assertEquals("1", parking.parkingUp(myCar3));
	}
	@Test
	public void parkingUp_And_pickUpCar_1 () {
		Parking parking = new Parking(10, 1);
		String myCar1 = "0001";
		assertEquals("1", parking.parkingUp(myCar1));
		String myCar2 = "0002";
		assertEquals("0", parking.parkingUp(myCar2));
		String myCar3 = "0001";
		assertEquals("1", parking.pickUpCar(myCar3));
	}
	@Test
	public void parkingUp_And_pickUpCar_2 () {
		Parking parking = new Parking(10, 1);
		String myCar1 = "0001";
		assertEquals("1", parking.parkingUp(myCar1));
		String myCar2 = "0002";
		assertEquals("0", parking.parkingUp(myCar2));
		String myCar3 = "0002";
		assertEquals("0", parking.pickUpCar(myCar3));
	}
	@Test
	public void parkingUp_And_pickUpCar_3 () {
		Parking parking = new Parking(10, 2);
		String myCar1 = "0001";
		assertEquals("1", parking.parkingUp(myCar1));
		String myCar2 = "0002";
		assertEquals("1", parking.parkingUp(myCar2));
		String myCar3 = "0001";
		assertEquals("1", parking.pickUpCar(myCar3));
		String myCar4 = "0002";
		assertEquals("1", parking.pickUpCar(myCar4));
	}
}
