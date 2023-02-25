public class count_the_number_of_daffodils_09 {
    public static void main(String[] args) {
        /**
         Find all the daffodil numbers between 0 and 999 and print them out.
            A "daffodil number" is a three-digit number whose cubical sum is equal to the number The body,
                such as; 153 is 1+5+3, right? Then 153 is a daffodil number.
       */

        for (int i = 0; i < 1000; i++) {
            int gewei = i % 10;
            int shiwei  = i / 10 % 10;
            int baiwei = i / 100;
            int sum = gewei * gewei * gewei + shiwei * shiwei * shiwei + baiwei * baiwei * baiwei;
            if (i == sum) {
                System.out.println(i + " is daffodil numbers");
            }
            
        }


//0 is daffodil numbers
//1 is daffodil numbers
//153 is daffodil numbers
//370 is daffodil numbers
//371 is daffodil numbers
//407 is daffodil numbers






    }
}
