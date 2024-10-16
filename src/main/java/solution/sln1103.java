package solution;

/**
 * @author kk
 * @description 分糖果2
 * @date 2024-10-15 08:53:26
 */
public class sln1103 {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int i = 0;
        while(candies != 0){
            ans[i % num_people] += Math.min(candies,i+1);
            candies -= Math.min(candies,i+1);
            i += 1;
        }
        return ans;
    }
}
