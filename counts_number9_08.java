public class counts_number9_08 {
    public static void main(String[] args) {
        /**
         Write a program that counts the number 9 in all integers from 1 to 100.
         */
        int count = 0; //存储9出现的次数
        for (int i = 1; i <= 100 ; i++) {
            if (i % 10 == 9) {//9 19 个位出现9
                count ++;
            }
        //因为99 就是个位也有9， 十位也有9， 不是一个非此即彼 的 else if 关系
        //并列分支这两个条件可以同时满足
            if (i / 10 == 9) {//十位出现9
                count ++;
            }

        }
        System.out.println("The number of times that the digit 9 appears in 1-100 is: " + count);
//The number of times that the digit 9 appears in 1-100 is: 20
    }
}
