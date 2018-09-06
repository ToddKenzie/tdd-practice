
public class Babysitter {

	private BabySitterTimeConversion converter;
	private int startHour;
	private int endHour;
	private int bedHour;
	private final int endShift = 4;
	private final int startShift = 17;
	private final int midnightDay2 = 0;
	private final int midnightDay1 = 24;
	private int start;
	private int end;

	public Babysitter() {
		converter = new BabySitterTimeConversion();
		bedHour = converter.ConvertTime("9:00 PM");
	}

	public void setBedTime(String bedTime) {
		bedHour = converter.ConvertTime(bedTime);
	}
	
	public int returnPay(String startTime, String endTime) {

		startHour = converter.ConvertTime(startTime);
		endHour = converter.ConvertEndTime(endTime);

		int totalCash = 0;

		totalCash += calculatePreBedTimePay();
		totalCash += calculateBedTimePay();
		totalCash += calculateAfterMidnightPay();

		return totalCash;
	}

	public int calculatePreBedTimePay() {
		int hours = 0;
		if (startHour < bedHour && startHour >= startShift) {
			start = startHour;
			if (endHour <= 4) {
				end = bedHour;
			} else {
				end = Math.min(endHour, bedHour);
			}
			hours = end - start;
		}
		return 12 * hours;
	}

	public int calculateBedTimePay() {
		int hours = 0;
		if (startHour >= startShift && (endHour > bedHour || endHour <= endShift)) {
			start = Math.max(startHour, bedHour);
			if (endHour <= 4) {
				end = midnightDay1;
			} else {
				end = Math.min(endHour, midnightDay1);
			}
			hours = end - start;
		}
		return 8 * hours;
	}

	public int calculateAfterMidnightPay() {
		int hours = 0;
		if (endHour <= endShift) {
			if (startHour > 4) {
				start = midnightDay2;
			} else {
				start = Math.max(startHour, midnightDay2);
			}
			end = endHour;
			hours = end - start;
		}
		return 16 * hours;
	}

}
