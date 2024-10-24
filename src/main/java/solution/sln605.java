package solution;

/**
 * @author kk
 * @description 种花问题
 * @date 2024-10-24 08:31:15
 */
public class sln605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        for(int i = 0;i < length;i++){
            if(i==0){
                if(flowerbed[1] != 1){
                    flowerbed[0] = 1;
                    n -= 1;
                }
            }else if(i < length - 1){
                if(flowerbed[i -1] != 1 && flowerbed[i + 1] != 1){
                    n -= 1;
                }
            }else{
                if(flowerbed[i -1 ] != 1){
                    flowerbed[i] = 1;
                }
            }
        }
        return n <= 0;
    }
}
