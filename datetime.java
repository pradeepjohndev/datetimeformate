import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class datetime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter date/time (yyyy-MM-dd HH:mm:ss): ");
        String input = scan.nextLine();

        LocalDateTime dateTime = parseDateTime(input);

        if (dateTime != null) {
            String formattedDateTime = dateTime.format(DateTimeFormatter.ofPattern("HH-MM-yyyy hh:mm:ss"));
            System.out.println("Formatted date/time: " + formattedDateTime);
        } else {
            System.out.println("Please enter a valid date/time.");
        }

        scan.close();
    }

    private static LocalDateTime parseDateTime(String input) {
        try {
            return LocalDateTime.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        } catch (Exception e) {
            return null;
        }
    }
}
