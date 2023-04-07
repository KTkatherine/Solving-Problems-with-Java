public class assign_initial_value_for_array_20 {
    /**
     Create an array and assign an initial value

     Create an array of int with 100 elements and set each element to the values 1-100

     数组的动态初始化
     */
    public static void main(String[] args) {

        int[] ret = buildArr();//等于buildArr方法的返回值
        printArray(ret);
    }

    private static void printArray(int[] arr) {
        for (int i : arr){
            System.out.print(i + " ");
        }
    }
    //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69 70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89 90 91 92 93 94 95 96 97 98 99 100


    public static int[] buildArr() {
    //在堆中开辟的空间大小？100int --> 400byte
    //每个元素的值？动态初始化，声明数组是没有赋值，则所有数组元素都是该数据类型的默认值， int -> 0
int[] arr = new int[100];
    //此时i就是数组的索引
    //i取值从【0....99】
    for (int i = 0; i < arr.length; i++) {
        arr[i] = i + 1;
    }
    return arr;
}
}
