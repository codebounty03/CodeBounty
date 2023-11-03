import java.util.Calendar;
import java.util.Scanner;

public class Calculate_age {

    public static void calculateAge(String name, int birthYear, int birthMonth, int birthDay) {
        Calendar currentTime = Calendar.getInstance();
        int currentYear = currentTime.get(Calendar.YEAR);
        int currentMonth = currentTime.get(Calendar.MONTH) + 1;
        System.out.println(currentMonth); 
        int currentDay = currentTime.get(Calendar.DAY_OF_MONTH);
        boolean leapYear = isLeap(currentYear);

        int ageYears = currentYear - birthYear;

        int ageMonths =0;
        int ageDays = 0;
        if(currentMonth<birthMonth || currentMonth==birthMonth && currentDay<birthDay) ageYears--;
        if(currentMonth>birthMonth) ageMonths=currentMonth-birthMonth;
        else ageMonths=12-(birthMonth-currentMonth);

        ageDays+=monthDays(birthMonth, leapYear)-birthDay;
        for (int month = birthMonth+1; month <=12; month++) {
            ageDays += monthDays(month, leapYear);
        }
        for (int year = birthYear+1; year < currentYear; year++) {
            if (isLeap(year)) {
                ageDays += 366;
            } else {
                ageDays += 365; 
            }
        }
        
        for(int month=1;month<currentMonth;month++)
        {
            ageDays+=monthDays(month, leapYear);
        }
        ageDays+=currentDay;
        
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

        calculateAge(name, birthYear, birthMonth, birthDay);
    }
}
