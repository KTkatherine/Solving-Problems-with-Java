import java.util.Scanner;

public class simulate_three_password_entries_10 {
    public static void main(String[] args) {
        /**
         Write code to simulate three password entries.
            You can enter the password at most three times.If the password is correct,
            you will be prompted to "login successfully". If the password is wrong, you can enter it again for
            at most three times. Three times are wrong, then prompt to quit the program
         */
        int count = 0;//记录次数
        System.out.println("Please set your password: ");
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        while (true) {
            System.out.println("Please enter your password:");
            String typeIn = scan.nextLine();
            count++;
            //
            if (password.equals(typeIn)) {
                System.out.println("The password is correct and the login is successful");
                break;
            }else {
                System.out.println("The password is wrong");
                if (count == 3) {
                    System.out.println("You've tried to sign in many times with an incorrect password");
                    break;
                }
                }


        }
//Please set your password:
//1223
//Please enter your password:
//2665
//The password is wrong
//Please enter your password:
//6359
//The password is wrong
//Please enter your password:
//32658
//The password is wrong
//You've tried to sign in many times with an incorrect password
//
//Process finished with exit code 0

//Please set your password:
//1223
//Please enter your password:
//1223
//The password is correct and the login is successful
//
//Process finished with exit code 0



    }
}
