package at_code.skil_check.track;
import java.util.Scanner;
// import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {

      int month = scanner.nextInt();
      int day = scanner.nextInt();

      int sum = month + day;
      int difference = Math.abs(month - day);

      if (sum >= 20 && difference >= 5) {
        System.out.println("Great");
      } else if ((sum >= 20 && difference < 5) || (sum < 20 && difference >= 5)) {
        System.out.println("Good");
      } else {
        System.out.println("Bad");
      }
    }
  }
}
