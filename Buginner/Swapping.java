import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        // TODO: Swapping of two variable
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st value: ");
        int value1 = scan.nextInt();
        System.out.print("Enter 2nd value: ");
        int value2 = scan.nextInt();

        // ? Method 1
        // int temp = value1;
        // value1 = value2;
        // value2 = temp;

        // ? Method 2
        // value1 = value1 + value2;
        // value2 = value1 - value2;
        // value1 = value1 - value2;

        // ? Method 3
        // value1 = value1 ^ value2;
        // value2 = value1 ^ value2;
        // value1 = value1 ^ value2;

        System.out.println("the value of 1 is : " + value1);
        System.out.println("the value of 2 is : " + value2);
    }
}
