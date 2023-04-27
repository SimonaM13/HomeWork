package Task1;
import java.util.Scanner;

public class MyFirstHomework {

        /*
    Условие:
    Напишете програма, която:
    - Чете за име на потребител;
    - Чете за любимо хоби на потребителя;
    - Изписва в конзолата подходящо съобщение за потребителя и хобито;
     */

        public static void main(String[] args) {

            System.out.println("Hello student!");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter your name:");

            String userName = scanner.nextLine();

            System.out.println("Welcome to our group, " + userName + "!");

            Scanner sc = new Scanner(System.in);

            System.out.println("Please enter your hobby:");

            String hobby = scanner.nextLine();

            System.out.println("Thank you for your answer, was nice to meet you." );

            System.out.println("BYE:)");
        }
    }

