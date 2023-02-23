public class print_prime_number_1to100_03 {
    public static void main(String[] args) {
        /**
         Print all prime numbers between 1 and 100
         */

        int count = 0;
        for (int i = 1; i <= 100; i++) {//外层循环表示从1到100的依次判断
            boolean isPrime = true;//Mark bits are introduced to determine whether i is prime or not.
            for (int j = 2; j < i; j++) {//内层循环判断是否为素数
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }

            }
        if (isPrime){
            count++;
            System.out.print(i + ",");//1,2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,//println就换行了
        }
        }
        System.out.println("\n" + count);//26







    }
}
