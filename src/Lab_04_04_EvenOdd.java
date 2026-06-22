public class Lab_04_04_EvenOdd {
    public static void main(String[] args) {

        int numToExamine = 7;
        int modResult = numToExamine % 2;

        if (modResult > 0) {
            System.out.println(numToExamine + " is odd.");
        } else {
            System.out.println(numToExamine + " is even.");
        }

    }
}
