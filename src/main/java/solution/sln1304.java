package solution;

/**
 * @author kk
 * @description 和为零的N个不同整数
 * @date 2024-11-4 11:39:26
 */
public class sln1304 {
    public int[] sumZero(int n) {
        int num;
        int[] ans = new int[n];
        if(n % 2 ==0){
            num = n /2;
            for(int i  = 0;i < num;i++){
                ans[i] = i+1;
                ans[n-1-i] = -i-1;
            }
        }else{
            num = n /2 +1;
            for(int i  = 0;i < num;i++){
                ans[i] = i+1;
                ans[n-1-i] = -i-1;
            }
            ans[num] = 0;
        }
        return ans;
    }
}
