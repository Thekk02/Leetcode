import personal.Swap;
import solution.sln118;
import solution.sln69;

import java.util.List;

/**
 * @author kk
 * @description 程序起点
 * @date 2024-6-5 08:56:54
 */
public class Main {
    public static void main(String[] args) {
        int x = 2,y = 4;
        x = x*y;
        y = x / y;
        x = x / y;
        System.out.println(x+"      "+y);
    }
}
