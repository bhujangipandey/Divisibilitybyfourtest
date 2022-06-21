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
		int year = Integer.parseInt(dateArray[dateArray.length - 1]);
        
		return year;
	}

	public static int getMonth(String date) {
		String[] dateArray = date.split("-");
		int month = Integer.parseInt(dateArray[dateArray.length - 2]);
		return month;
	}

	public static int getDate(String date) {
		String[] dateArray = date.split("-");
		int day = Integer.parseInt(dateArray[dateArray.length - 3]);
		return day;
	}

	public static boolean checkDatePattern(String date) {
		if (date.matches("^((0[1-9])|(1[0-9])|(2[0-9])|(3[0-1]))-((0[1-9])|(1[1-2]))-([0-9]{4})$")) {
			return true;
		}
		return false;
	}

	public static boolean leapYearOrNot(String date) {
		String[] dateArray = date.split("-");
		int year = Integer.parseInt(dateArray[dateArray.length - 1]);
		if
		return false;
        	
        }	
        


	}


