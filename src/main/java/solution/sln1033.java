package solution;

/**
 * @author kk
 * @description 移动石子直到连续
 * @date 2024-10-23 10:12:01
 */
public class sln1033 {
    public int[] numMovesStones(int a, int b, int c) {
        int z = Math.max(Math.max(a,b),c);
        int x = Math.min(Math.min(a,b),c);
        int y = a + b + c - x- z;
        int[] ans = new int[2];
        ans[0] = 2;
        if(x+1 == y && y+1 == z){
            ans[0] = 0;
        }else if(y - x <= 2 || z -y <= 2){
            ans[0] = 1;
        }
        ans[1] = z - x -2;
        return ans;
    }
}
