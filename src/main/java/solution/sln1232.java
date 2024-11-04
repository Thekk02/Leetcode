package solution;

/**
 * @author kk
 * @description 缀点成线
 * @date 2024-10-28 16:50:15
 */
public class sln1232 {
    public boolean checkStraightLine(int[][] coordinates) {
        int[] dot1 = coordinates[0];
        int[] dot2 = coordinates[1];
        double k = (dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);
        double b = dot1[1] - (k * dot1[0]);
        for(int i = 0;i < coordinates.length;i++){
            if(coordinates[i][1] != coordinates[i][0] * k + b){
                return false;
            }
        }
        return true;
    }
}
