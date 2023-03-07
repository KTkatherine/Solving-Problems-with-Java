import java.util.Scanner;

public class sum_of_factorials_14 {
    /**
     Take the sum of factorials

        Calculate 1! + 2! + 3! ... ... + n!
     */
    public static void main(String[] args) {
        System.out.println("Please enter an integer:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        //calculate sum of the factorial values from 1 ... n
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += factor(i);
        }
        System.out.println(sum);



    }

    public static int factor (int num) {
        int ret = 1;
        for (int i = 1; i <= num; i++) {
            ret *= i;
        }
        return ret;
    }



}
