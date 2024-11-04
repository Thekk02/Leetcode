package solution;

/**
 * @author kk
 * @description 分割平衡字符串
 * @date 2024-11-4 10:14:23
 */
public class sln1221 {
    public int balancedStringSplit(String s) {
        int ans = 0,d = 0;
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'L'){
                d++;
            }
            else{
                d--;
            }
            if(d == 0){
                ++ans;
            }
        }
        return ans;
    }
}
