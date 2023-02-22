import java.util.Scanner;

public class whether_the_number_is_prime_02 {
    public static void main(String[] args) {
        /**
         Determines whether a number is prime.

         Prime numbers are numbers greater than 1. They only have two factors, 1 and the number itself.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any positive integer:");
        int num = scan.nextInt();

//        for (int i = 2; i < num; i++) {// for loop doesn't take 1 and itself, they are the only factors the num have.
//            if (num % 1 == 0) {//now, the num is one of factor of num, it isn't a prime number.
//                System.out.println(num + " isn't prime number");
//                break;
//            }
//        }
//        System.out.println(num + " is prime number");

//        Please enter any positive integer:
//        33
//        33 isn't prime number
//        33 is prime number

        // fix code
       //--->>> 引入标志位（状态位）

        boolean isPrime = true;
        for (int i = 2; i < num; i++) {// for loop doesn't take 1 and itself, they are the only factors the num have.
            if (num % 1 == 0) {//now, the num is one of factor of num, it isn't a prime number.
                isPrime = false;
                System.out.println(num + " isn't prime number");
                break;
            }

            if (isPrime) {//默认isPrime is true
            }
            System.out.println(num + " is prime number");
//            Please enter any positive integer:
//            33
//            33 isn't prime number
        }
    }
}
