import java.time.LocalTime;
import java.time.format.*;

public class Babysitter {

	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:m a");
	private LocalTime startTime;
	private LocalTime endTime;
	private LocalTime bedTime;  
	
	
	
	public int returnPay(String startTime, String endTime) {
		bedTime = LocalTime.parse("9:00 PM", formatter);
		this.startTime = LocalTime.parse(startTime, formatter);
		this.endTime = LocalTime.parse(endTime, formatter);
		int totalCash = 0;
		if (this.startTime.isBefore(bedTime) ) {
			int start = this.startTime.getHour();
			int end = Math.min(this.endTime.getHour(), bedTime.getHour());
			int hours = end - start;
			totalCash += calculatePreBedTimePay(hours);
		}
		if (this.endTime.isAfter(bedTime)) {
			int start = Math.max(this.startTime.getHour(), bedTime.getHour());
			int end = this.endTime.getHour();
			int hours = end - start;
			totalCash += calculateBedTimePay(hours);
		}
		return totalCash;				
	}

	public int calculatePreBedTimePay(int hours) {
		return 12 * hours;
	}
	
	
	public int calculateBedTimePay(int hours) {
		return 8 * hours;
	}
	
	
	//hour start - hour end.
	//if 
}
