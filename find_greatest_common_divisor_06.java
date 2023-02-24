import java.util.Scanner;

public class find_greatest_common_divisor_06 {
    public static void main(String[] args) {
        /**
         Find the greatest common divisor of two positive integers

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two positive integers a and b");
        int a = scan.nextInt();
        int b = scan.nextInt();
        //max方法返回a和b的最大值
        int max = Math.max(a,b);
        int min = Math.min(a,b);

//        System.out.println(Math.max(a,b));//102
//        System.out.println(Math.min(a,b));//36

        while (min > 0) {
            int temp = min;//暂存一下min的值，因为下面马上就要更改min的值了
            min = max % min;
            max = temp;
        }
        //当min为0时，max 就是最大公约数
        System.out.println(a + "," + b + " greatest common divisor is: " + max);
    }
}

//Please enter two positive integers a and b
//36 102
//36,102 greatest common divisor is: 6
//
//Process finished with exit code 0