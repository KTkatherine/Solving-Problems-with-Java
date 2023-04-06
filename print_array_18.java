public class print_array_18 {


    /**
     * Print Array
     * <p>
     * Write a method that takes an array as an argument and loops through each element in the array,
     * printing the value of each element.
     */
public static void main(String[] args){
    int[] data = new int[] {1,3,5,7,9};
    printArray(data);
}

    public static void printArray(int[] arr) {
        //此处的i不是索引，而是arr数组中每个元素的值
        for (int i : arr) {
            System.out.println(i + " ");
        }

    }
}