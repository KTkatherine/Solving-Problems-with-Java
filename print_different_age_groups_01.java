import java.util.Scanner;

public class print_different_age_groups_01 {
    public static void main(String[] args) {
        /**
         * Depending on age, the person that prints the current age is a teenager (less than 18),
         young adults (19-28), middle-aged (29-55) or old people (more than 56)
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scan.nextInt();
        if (age <= 18) {
            System.out.println("Teenager");
        }else if (age >= 19 && age <= 28) {
            System.out.println("Young adult");
        }else if (age >= 29 && age <= 55) {
            System.out.println("Middle-aged");
        }else {
            System.out.println("old people");
        }


    }
}
