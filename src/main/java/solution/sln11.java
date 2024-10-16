package solution;

/**
 * @author kk
 * @description 盛最多水的容器
 * @date 2024-10-16 09:24:16
 */
public class sln11 {
    public int maxArea(int[] height) {
        int n = height.length;
        int l=0,r = height.length - 1;
        int ans = 0;
        while(l < r){
            int area = Math.min(height[l],height[r]) * (r-l);
            ans = Math.max(ans,area);
            if(height[l] <= height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    }
}
