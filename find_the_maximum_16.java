public class find_the_maximum_16 {
    /**
    calculate the maximum

     Create a method that finds the maximum of two numbers max2,
        then write a new method to find the function of maximum value of three numbers max3.

     Requirements: calling the function of max2 in the function of max3,
                        To achieve the calculation of the maximum value of three numbers

     */
    public static void main(String[] args){
        int a = 10;
        int b = 30;
        int c = 20;
        int max = max3(a,b,c);
        System.out.println(max);//30

    }



    public static int max2(int a, int b){
/*        if (a >= b) {
            return a;
        }
        return b;
*/
        //用三目运算符
        return a > b ? a : b;
    }

    public static  int max3(int a, int b, int c){
        int tempMax = max2(a,b);
        return max2(tempMax, c);

    }







}
