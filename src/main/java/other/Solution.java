package other;

import java.util.Random;

/**
 * @author kk
 * @description 在园内随机生成点
 * @date 2024-10-24 08:15:10
 */public class Solution {
    Random random;
    double xc,yc,r;

    public Solution(double radius, double x_center, double y_center) {
        random = new Random();
        xc = x_center;
        yc = y_center;
        r = radius;
    }

    public double[] randPoint() {
        while(true){
            double x = random.nextDouble()*(2 * r) - r;
            double y = random.nextDouble()*(2 * r) - r;
            if(x * x + y * y <= r * r){
                return new double[]{xc+x,yc+y};
            }
        }
    }
}

