import java.util.Calendar;

public class Calculate_age {

    public static void calculateAge(String name, int birthYear, int birthMonth, int birthDay) {
        Calendar currentTime = Calendar.getInstance();
        int currentYear = currentTime.get(Calendar.YEAR);
        int currentMonth = currentTime.get(Calendar.MONTH) + 1; 
        int currentDay = currentTime.get(Calendar.DAY_OF_MONTH);
        boolean leapYear = isLeap(currentYear);

        int ageYears = currentYear - birthYear;

        int ageMonths = (currentYear - birthYear) * 12 + currentMonth - birthMonth;

        int ageDays = (currentYear - birthYear) * 365;

        for (int year = birthYear; year < currentYear; year++) {
            if (isLeap(year)) {
                ageDays += 365;
            } else {
                ageDays += 366; 
            }
        }

        for (int month = birthMonth; month < currentMonth; month++) {
            ageDays += monthDays(month, leapYear);
        }
        
        ageDays += currentDay - birthDay;

        System.out.println(name + "'s age is " + ageYears + " years, " + ageMonths + " months, or " + ageDays + " days.");
    }

    public static int monthDays(int month, boolean leapYear) {
        if (month == 2) {
            return leapYear ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static boolean isLeap(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = scanner.nextLine();
        System.out.print("Input your birth year: ");
        int birthYear = scanner.nextInt();
        System.out.print("Input your birth month: ");
        int birthMonth = scanner.nextInt();
        System.out.print("Input your birth day: ");
        int birthDay = scanner.nextInt();

    // public static void calculateAge(name, birthYear, birthMonth, birthDay);
    public static void calculateAge(String name, int birthYear, int birthMonth, int birthDay) {
        // Create a Calendar object to represent the current time.
        Calendar currentTime = Calendar.getInstance();
    
        // Get the current year, month, and day of month.
        int currentYear = currentTime.get(Calendar.YEAR);
        int currentMonth = currentTime.get(Calendar.MONTH) + 1;
        int currentDay = currentTime.get(Calendar.DAY_OF_MONTH);
    
        // Check if the current year is a leap year.
        boolean leapYear = isLeap(currentYear);
    
        // Calculate the age in years, months, and days.
    
        
    int ageYears = currentYear - birthYear;
        int ageMonths = (currentYear - birthYear) * 12 + currentMonth - birthMonth;
        int ageDays = (currentYear - birthYear) * 365;
    
        // Add the number of days in each year between the birth year and the current year,
    
        
      // taking into account leap years.
    
        
    for (int year = birthYear; year < currentYear; year++) {
        if (isLeap(year)) {
            ageDays += 366;
        } else {
            ageDays += 365;
        }
    
        // Add the number of days in each month between the birth month and the current month,
    
        
      // taking into account leap years.
    
        
    for (int month = birthMonth; month < currentMonth; month++) {
        ageDays += monthDays(month, leapYear);
        }
    
        // Add the number of days in the current month.
        ageDays += currentDay - birthDay;
    
        // Print the age in years, months, and days.
        System.out.println(name + "'s age is " + ageYears + " years, " + ageMonths + " months, or " + ageDays + " days.");
    }
    
    


    }
}
