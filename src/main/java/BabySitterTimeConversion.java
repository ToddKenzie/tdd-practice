import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BabySitterTimeConversion {

	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:m a");
	private LocalTime time;
	
	public int ConvertTime(String time) {
		this.time = LocalTime.parse(time, formatter);
		return this.time.getHour();
	}
	
	public int ConvertEndTime(String time) {
		this.time = LocalTime.parse(time, formatter);
		if (this.time.getMinute() > 0) {
			return this.time.getHour() + 1;
		} else {
			return this.time.getHour();
		}
	}
}
