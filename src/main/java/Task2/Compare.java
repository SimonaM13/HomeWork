package Task2;
import java.util.Scanner;

public class Compare{
    /*
    Условие:
    Сравнете 2 стринга дали са еднакви -
    подадени от конзолата и изпишете резултата в нея.
     */
    public static void main(String[] args) {

        // first string
        System.out.println("Enter first string: ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        // second string
        System.out.println("Enter second string: ");
        Scanner sc2 = new Scanner(System.in);
        String s2 = sc.nextLine();
        // check
        if (s1.equals(s2)) {
            System.out.println("Strings Are Equal");
        } else {
            System.out.println("Strings Are Not Equal");
        }
    }
}