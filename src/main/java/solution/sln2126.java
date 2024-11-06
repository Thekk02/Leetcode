package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 摧毁小行星
 * @date 2024-11-6 09:44:10
 */
public class sln2126 {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long curr = mass;
        for(int i = 0;i < asteroids.length;i++){
            if(curr < asteroids[i]){
                return false;
            }else{
                curr += asteroids[i];
            }
        }
        return true;
    }
}
