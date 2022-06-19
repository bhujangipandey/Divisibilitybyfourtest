package leapyeartest2;

public class LeapYearTest {

	public static boolean checkDivisibleByFour(String year) {
		String lastValue = year.substring(2, 4);
		int lastTwoNumber = Integer.parseInt(lastValue);
		if (lastTwoNumber % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}
	public static int getYear(String date) {
		String[] dateArray = date.split("-");
		int year = Integer.parseInt(dateArray[dateArray.length-1]);
		return year;
}
}
