import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BabysitterTest {

	
	/*The babysitter 
	- starts no earlier than 5:00PM
	- leaves no later than 4:00AM
	- gets paid $12/hour from start-time to bedtime
	- gets paid $8/hour from bedtime (9pm) to midnight
	- gets paid $16/hour from midnight to end of job
	- gets paid for full hours (no fractional hours)


	Feature:
	As a babysitter
	In order to get paid for 1 night of work
	I want to calculate my nightly charge*/
	Babysitter sitter;
	
	@Before
	public void setUp() {
	sitter = new Babysitter();
	}
	
	@Test
	public void getPaid12For1HourOfWork() {
		int cash = sitter.returnPay("5:00 PM", "6:00 PM");
		assertEquals(12, cash);
	}
	
	@Test
	public void getPaid24For2HoursOfWork() {
		int cash = sitter.returnPay("5:00 PM", "7:00 PM");
		assertEquals(24, cash);
	}
	
	@Test
	public void getPaid8For1HourOfAfterBedWork() {
		int cash = sitter.returnPay("9:00 PM", "10:00 PM");
		assertEquals(8, cash);
	}
	
	@Test
	public void getPaid16For2HourOfAfterBedWork() {
		int cash = sitter.returnPay("9:00 PM", "11:00 PM");
		assertEquals(16, cash);
	}
	
	@Test
	public void getPaid20For1HourPreAnd1HourOfAfterBedWork() {
		int cash = sitter.returnPay("8:00 PM", "10:00 PM");
		assertEquals(20, cash);
	}
}
