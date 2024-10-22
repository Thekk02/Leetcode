package solution;

/**
 * @author kk
 * @description 构造矩形
 * @date 2024-10-22 10:20:38
 */
public class sln492 {
    public int[] constructRectangle(int area) {
        int w = (int)Math.sqrt(area);
        while(area % w != 0){
            w--;
        }
        return new int[]{area/w,w};
    }
}
