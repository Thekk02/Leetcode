package solution;

/**
 * @author kk
 * @description 交换后字典序最小的字符串
 * @date 2024-10-30 16:57:02
 */
public class sln3216 {
    public String getSmallestString(String s) {
        char[] chars = s.toCharArray();
        for(int i = 0; i + 1< chars.length;i++){
            if(chars[i] > chars[i+1] && chars[i] % 2 == chars[i+1] % 2){
                char temp = chars[i];
                chars[i] = chars[i+1];
                chars[i+1] = temp;
                break;
            }
        }
        return new String(chars);
    }
}
