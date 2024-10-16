package solution;

/**
 * @author kk
 * @description 交替组1
 * @date 2024-10-16 11:23:15
 */
public class sln3206 {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int ans = 0;
        if(colors[0] != colors[1] && colors[0] != colors[n-1]){
            ans += 1;
        }
        if(colors[n-1] != colors[n-2] && colors[0] != colors[n-1]){
            ans += 1;
        }
        for(int i = 1;i < n - 1;i++){
            if(colors[i] != colors[i -1] && colors[i] != colors[i+1]){
                ans += 1;
            }
        }
        return ans;
    }
}
