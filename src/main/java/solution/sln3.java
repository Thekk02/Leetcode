package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 无重复字符的最长字串
 * @date 2024-6-5 09:14:12
 */
public class sln3 {
    public int lengthOfLongestSubstring(String s) {
        //哈希集合，记录每个字符是否出现过
        Set<Character> set = new HashSet<Character>();
        int n = s.length();
        //右指针，初始值为1，相当于在字符串的左边界的左侧，还未移动
        int rk = -1,ans = 0;
        for(int i = 0;i < n;i++){
            if(i != 0)
            {
                //左指针向右移动一格，移除一个字符
                set.remove(s.charAt(i));
            }
            while(rk + 1 < n && !set.contains(s.charAt(rk+1))){
                set.add(s.charAt(rk+1));
                ++rk;
            }
            //第i到rk个字符是一个极长的无重复字符子串
            ans = Math.max(ans,rk - i +1);
        }


        return ans;
    }
}
