package solution;

/**
 * @author kk
 * @description 找出第k个字符1
 * @date 2024-10-21 14:53:40
 */
public class sln3304 {
    public char kthCharacter(int k) {
        String origin = "a";
        while(origin.length()<k){
            origin = helper(origin);
        }
        return origin.charAt(k -1);
    }
    public String helper(String str){
        StringBuilder sb = new StringBuilder(str);
        char[] ch = str.toCharArray();
        for(char c : ch){
            sb.append((char)c+1);
        }
        return sb.toString();
    }

}
