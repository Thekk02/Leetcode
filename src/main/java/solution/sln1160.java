package solution;

/**
 * @author kk
 * @description 拼写单词
 * @date 2024-11-4 10:55:57
 */
public class sln1160 {
    public int countCharacters(String[] words, String chars) {
        int ans = 0;
        for(int i = 0;i < words.length;i++){
            if(helper(words[i],chars)){
                ans += words[i].length();
            }
        }
        return ans;
    }
    public boolean helper(String s1,String s2){
        return s2.contains(s1);
    }
}
