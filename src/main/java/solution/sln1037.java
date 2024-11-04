package solution;

/**
 * @author kk
 * @description 有效的回旋镖
 * @date 2024-11-4 16:23:09
 */
public class sln1037 {
    public boolean isBoomerang(int[][] points) {
        return (points[1][1] - points[0][1]) / (points[1][0] - points[0][0]) != (points[2][1] - points[1][1]) / (points[2][0] - points[1][0]);
    }
}
