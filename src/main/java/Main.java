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
         ms1621 ms = new ms1621();
        int[] arr1 = {4,1,2,1,1,2};
        int[] arr2 = {3,6,3,3};
        System.out.println(ms.findSwapValues(arr1,arr2).toString());
    }
}
