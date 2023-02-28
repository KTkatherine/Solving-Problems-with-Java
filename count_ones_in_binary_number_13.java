import java.util.Scanner;

public class count_ones_in_binary_number_13 {
    public static void main(String[] args) {
        /**
         Write a function that returns the number of ones in the binary argument

         */


//        1. Get the binary sequence of numbers, modulo the number by 2 then dividing 2 until the number becomes 0.
//        得到数的二进制序列，模2除2
//
//        2. 对二进制序列中的1进行计数，计数方式：写一个计数器即可。
        Scanner scan = new Scanner(System.in);//enter the number that you want to calculate
        System.out.println("Please enter the number you want to calculate: ");
        int num = scan.nextInt();
        int count = 0;

        while (num > 0) {
            if (num % 2 == 1)
                count++;
            num = num / 2;
        }
        num = num / 2; // num /=2;
        System.out.println("The number has " + count + " ones" );
    }
//Please enter the number you want to calculate:
//15
//The number has 4 ones
//
//Process finished with exit code 0


        







}
