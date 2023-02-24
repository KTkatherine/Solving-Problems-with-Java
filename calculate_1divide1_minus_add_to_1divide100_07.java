public class calculate_1divide1_minus_add_to_1divide100_07 {
    public static void main(String[] args) {
        /**
         calculate 1/1 - 1/2 + 1/3 - 1/4 + 1/5 ........-1/100 = ?
         */
    double sum = 0.0;
    int flag = 1;
        for (int i = 1; i <= 100; i++) {
            sum += 1.0/ i * flag;
            flag = -flag;//此处flag不停取反。用于标注加减
        }
        System.out.println(sum);//0.688172179310195


    }
}
