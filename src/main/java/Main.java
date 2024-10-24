import other.Solution;
import personal.Swap;
import solution.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 程序起点
 * @date 2024-6-5 08:56:54
 */
public class Main {
    public static void main(String[] args) {
        double ans = 0;
        for(int i = 1;i <= 1000;i++){
            if(i % 4 == 0 ){
                ans += 366;
            }else {
                ans += 365;
            }
        }
        System.out.println((ans - 1) / 1000);
    }
}
