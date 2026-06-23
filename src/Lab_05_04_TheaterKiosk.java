import java.util.Scanner;

public class Lab_05_04_TheaterKiosk {

    public static void main(String[] args) {

        // start
        Scanner scanner = new Scanner(System.in);

        // output "Enter your age: "
        System.out.print("Enter your age: ");

        int age = scanner.nextInt();

        // if age >= 21
        if (age >= 21) {
            // output "you get a paper wrist band!"
            System.out.println("You get a paper wrist band!");
        }
        // end if
        // end
    }
}
