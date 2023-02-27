import java.util.Scanner;

public class prints_out_each_bit_of_an_integer_11 {
    public static void main(String[] args) {
        /**
         Prints out each bit of an integer
         */
        System.out.println("Please enter any positive integer");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while (num > 0) {
            System.out.println(num % 10 + " ");
            num = num / 10;//不断在取个位
        }
    }
}
