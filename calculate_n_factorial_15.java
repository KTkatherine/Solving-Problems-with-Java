public class calculate_n_factorial_15 {
    /**
     * please enter any positive integer, then you can get its factorial.
     */
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factor(num));//120

    }

    public static int factor(int num) {
        //终止条件（所谓终止条件，就是不借助任何函数调用的基础上就能直接解决问题）
        if (num == 1) {
        //无需借助任何外部力量，我就知道 num = 1 的阶乘就是1！
        return 1;
    }
    //num >= 2
    //我当前只知道num的值是多少，剩下的num - 1的值我并不知道，交给别人帮我处理
    // 调用factor(num - 1) => 能帮我求出num - 1!
    //最后一步，只用拼接答案
        return num * factor(num - 1);
}

}
