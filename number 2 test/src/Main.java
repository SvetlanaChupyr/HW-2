//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("What is your speed now, km/h?");
        var speed = scanner.nextDouble();

        while (true) {
            System.out.println("How mush hours to your destination, h?");
            var hours = scanner.nextDouble();

            if (hours == 0)
                break;

            var result = speed * hours;
            System.out.println("Result = " + result);
        }
    }
}