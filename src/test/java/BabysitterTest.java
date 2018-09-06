import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BabysitterTest {

	Babysitter sitter;
	
	@Before
	public void setUp() {
	sitter = new Babysitter();
	}
	
	@Test
	public void getPaid12For1HourOfPreBedWork() {
		int cash = sitter.returnPay("5:00 PM", "6:00 PM");
		assertEquals(12, cash);
	}
	
	@Test
	public void getPaid24For2HoursOfPreBedWork() {
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
	
	@Test
	public void getPaid16For1HourPostMidnight() {
		int cash = sitter.returnPay("12:00 AM", "1:00 AM");
		assertEquals(16,  cash);
	}
	
	@Test
	public void getPaid32For2HoursPostMidnight() {
		int cash = sitter.returnPay("12:00 AM", "2:00 AM");
		assertEquals(32, cash);
	}
	
	@Test
	public void getPaid24For1PostBedAnd1PostMidnight() {
		int cash = sitter.returnPay("11:00 PM", "1:00 AM");
		assertEquals(24, cash);
	}
	
	@Test
	public void getPaid136ForFullShift() {
		int cash = sitter.returnPay("5:00 PM", "4:00 AM");
		assertEquals(136, cash);
	}
	
	@Test
	public void getPaid12forStartLatePreBedHour() {
		int cash = sitter.returnPay("5:46 PM", "6:00 PM");
		assertEquals(12, cash);
	}
	
	@Test
	public void getPaid12forEndEarlyPreBedHour() {
		int cash = sitter.returnPay("5:00 PM", "5:01 PM");
		assertEquals(12, cash);
	}
	
	@Test
	public void getPaid20For1HourPreAnd1HourOfAfterBedWorkWith8PMBed() {
		sitter.setBedTime("8:00 PM");
		int cash = sitter.returnPay("7:00 PM", "9:00 PM");
		assertEquals(20, cash);
	}
}
