import java.util.*;
public class ques3 {
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false; 
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true; 
        } else {
            return false; 
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
