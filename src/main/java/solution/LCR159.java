package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 库存管理3
 * @date 2024-10-21 08:50:04
 */
public class LCR159 {
    public int[] inventoryManagement(int[] stock, int cnt) {
        Arrays.sort(stock);
        return Arrays.copyOfRange(stock,0,cnt);

    }
}
