import java.util.Scanner;
public class Lab_05_02_BirthMonth {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your birth month (1-12): ");
    int month = Integer.parseInt(scanner.nextLine());

    if (month >= 1 && month <= 12) {
        System.out.println("Your birth month is: " + month);
    } else {
        System.out.println("You entered an incorrect month value: " + month);



}
}
}
