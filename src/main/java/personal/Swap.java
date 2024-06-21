package personal;

/**
 * @author kk
 * @description 交换两个数的值（）记载几种不同的方法
 * @date 2024-6-19 13:50:02
 */
public class Swap {
    //临时变量
    public void swap1(int x,int y){
        int temp = x;
        x = y;
        y = temp;
    }
    //利用乘积
    public void swap2(int x, int y){
        x = x * y;
        y = x / y;
        x = x / y;
    }
    //利用异或运算（时间空间都是最快）
    public void swap3(int x,int y){
        x = x ^= y;
        y = x ^= y;
        x = x ^= y;
    }
}
