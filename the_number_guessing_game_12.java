import java.util.Random;
import java.util.Scanner;

public class the_number_guessing_game_12 {
    public static void main(String[] args) {
        /**
         Complete the number guessing game
         */

        Random random = new Random();//Java中，生成随机数的是一个Random类，类似于Scanner，先要产生一个Random类的实例。
        //生成随机数的范围，默认是上限，正整数
        // 生成【0 —— 100）的随机数
        //Java中基本上带区间的规则基本上都是左闭右开的规则
        int randomNum = random.nextInt(100);//输入100，自己就会出现bound 100了
        System.out.println("The generated random number is " + randomNum);
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Please enter the number you want to guess");
            int guess =scan.nextInt();
            if (guess < randomNum){
                System.out.println("The number you entered is small");
            }else if (guess > randomNum) {
                System.out.println("The number you entered is large");
            }else {
                System.out.println("bingo~that's right!");
                break;
            }
        }

//The generated random number is 21
//Please enter the number you want to guess
//18
//The number you entered is small
//Please enter the number you want to guess
//19
//The number you entered is small
//Please enter the number you want to guess
//36
//The number you entered is large
//Please enter the number you want to guess
//26
//The number you entered is large
//Please enter the number you want to guess
//21
//bingo~that's right!
//
//Process finished with exit code 0



    }
}
