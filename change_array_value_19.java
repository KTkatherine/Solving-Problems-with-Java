public class change_array_value_19 {


    /**
     Change the original array value

     Write a method that takes an array as an argument
     and loops over each array element by 2 and sets it to that element.








     */
    public static void main(String[] args) {
        int[] data = new int[] {1,2,3,};
        transform(data);//需要借用别的方法打印出来
      printArray(data);//2 4 6
    }

  public static void transform(int[] arr) {
      //修改数组内容，只能使用普通for 循环
      //此时i 是数组的索引下标从0开始
      for (int i = 0; i < arr.length; i++) {
          arr[i] = arr[i] * 2;
      }
  }

  public static void printArray(int[] arr) {
      for (int i : arr) {
          System.out.print(i + " ");
      }
  }
}
