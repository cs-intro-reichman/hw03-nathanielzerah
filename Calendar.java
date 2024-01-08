public class Calendar {	
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int nDaysInMonth = 31;
	
	public static void main(String args[]) {
        int xyear = Integer.parseInt(args[0]);
        int monthmax = 12;
        int TotalDay = 1;
        while (year < xyear){
            month = 1;
            while (month <= monthmax){
                dayOfMonth = 1;
                int dm = nDaysInMonth(month, year);
                while (dayOfMonth <= dm){
                    dayOfMonth++;
                    TotalDay++; 
                }
                month++;
            }
            year++;
        }
            month = 1;
            while (month <= monthmax){
                dayOfMonth = 1;
                int dm = nDaysInMonth(month, xyear);
                while (dayOfMonth <= dm){
                    if (TotalDay % 7 == 0){
                        System.out.println(dayOfMonth + "/" + month + "/" + xyear + " Sunday");
                    } else {
                    System.out.println(dayOfMonth + "/" + month + "/" + xyear);
                    }
                    dayOfMonth++;
                    TotalDay++; 
                }
                month++;
            }

	 }
		 
	private static boolean isLeapYear(int year) {
	    boolean LeapYear;
        if (year % 4 == 0 && year != 1900){
            LeapYear = true;
        } else {
            LeapYear = false;
        }
		return LeapYear;
	}
	 
	private static int nDaysInMonth(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        } else if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        } else {
            return 30;
        }
	}
}