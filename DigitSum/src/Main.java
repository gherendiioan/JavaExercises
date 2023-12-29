import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.println("The sum of the digits in number " + number + " is " + sumDigits(number));
        scanner.close();
    }

    public static int sumDigits(int number){
        if (number < 0) {
            System.out.println("Invalid value was passed");
            return -1;
        }
        int sum = 0;

        while (number > 9){

             //Use of the remainder operator to extract digits
             sum += (number % 10);

             //Use of the division operator to truncate digits
             number = number /10;
        }

        //Add the last number or single digit number to sum
        sum += number;

        return sum;
    }

}
