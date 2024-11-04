package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 重塑矩阵
 * @date 2024-10-25 10:54:24
 */
public class sln566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length * mat[0].length != r *c){
            return mat;
        }
        List<Integer> temp = new ArrayList<>();
        for(int i = 0;i < mat.length;i++){
            for(int j = 0;j < mat[0].length;j++){
                temp.add(mat[i][j]);
            }
        }
        int[][] ans = new int[r][c];
        int index = 0;
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                ans[i][j] = temp.get(index);
                index++;
            }
        }
        return ans;
    }
}
