import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class calculateAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input birthdate in the format "dd/MM/yyyy"
        System.out.print("Input your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your birthdate (dd/MM/yyyy): ");
        String birthdateStr = scanner.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date birthdate = dateFormat.parse(birthdateStr);
            Date currentDate = new Date();  // Current date

            // Calculate age
            long diffInMilliseconds = currentDate.getTime() - birthdate.getTime();
            long diffInYears = diffInMilliseconds / (1000L * 60 * 60 * 24 * 365);

            System.out.println("Your age is approximately " + diffInYears + " years.");
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
        }
    }
}