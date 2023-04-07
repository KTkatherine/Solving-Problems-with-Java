public class coping_an_array_21 {
    /**
     Copying of an Array

     Write a method that copies an entire array of integers into a new array.

     （值从原数组来但的确创建了一个新的对象）
     */

    public static void main(String[] args) {
        int[] data = new int[] {1,3,5,};
        int[] newData = copyOf(data);
        //在程序中如何证明newData是一块新的数组空间,而不是指向原data数组 --->改data数组里的值,看原data 数组里面的值变不变
        data[0] = 10;//没有产生任何影响,说明我们这里的确是两块内存区.
        printArray(newData);//1 3 5
        printArray(data);//10 3 5 

    }

public static int[] copyOf(int[] arr){
    //创建一个新数组，新数组的长度就是原数组的长度。
    int[] newArr = new int[arr.length];
    //拷贝？---依次访问原数组的每个元素有，将元素值依次赋值给新数组的对应位置
    for (int i = 0; i < arr.length; i++) {
        newArr[i] = arr[i];
    }
return newArr;
}

public static void printArray(int[] arr){
        for (int i : arr){
            System.out.print(i + " ");
        }
}



}
