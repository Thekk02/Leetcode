package solution;

/**
 * @author kk
 * @description 将一维数组转变成二位数组
 * @date 2024-11-1 09:37:36
 */
public class sln2022 {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] ans = new int[m][n];
        if(original.length != m * n){
            return new int[0][];
        }
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                ans[i][j] = original[i*n + j];
            }
        }
        return ans;
    }
}
