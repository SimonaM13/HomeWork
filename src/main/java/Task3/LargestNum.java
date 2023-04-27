package Task3;

public class LargestNum {

        /*
    Условие:
    Напишете програма/метод, която приема от конзолата
    3 подадени числа определя кое е най-голямо.
     */

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if (a > b && a > c)
            System.out.println(a + " is the largest number");
        else if (a < b && b > c)
            System.out.println(b + " is the largest number");
        else
            System.out.println(c + " is the largest number");

    }

}


