public class maximum_method_overloaded_17 {
    /**
     Calculate the maximum by using the method overload

     Define multiple methods in the same class:
        Requirements: not only can find the maximum value of two integers,
        but also can find the maximum value of two decimal numbers,
        and the size relationship between two decimal numbers and an integer

     */
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        double c = 20.1;
        double d = 40.5;

        int max1 = max(a,b);
        System.out.println(max1);//
        System.out.println(max(a,b));//和上面的输出方法一样
        System.out.println(max(c,d));
        System.out.println(max(c,d,b));
        //30
        //30
        //40.5
        //40.5

    }

    public static int max(int a, int b){
        return a > b ? a : b;
    }

    public static double max(double a, double b){
        return a > b ? a : b;
    }

    public static double max (double a,double b, int c){//方法参数个数不同
        double tempMax = max(a,b);
        double tempC = c + 0.0;//或者c * 1.0 把c 变成double 类型
        return tempMax > tempC ? tempMax : tempC;
    }



}
