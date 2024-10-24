package solution;

/**
 * @author kk
 * @description 反转字符串2
 * @date 2024-10-24 15:24:41
 */
public class sln541 {
    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int length = s.length();
        int startindex = 0;
        int count = 0;
        for(int i = 0;i < length -1; i++){


        }
        return null;
    }
    public void Reverse(char[] ch ,int startindex,int endindex){
        while(startindex < endindex){
            char temp = ch[startindex];
            ch[startindex] = ch[endindex];
            ch[endindex] = temp;
        }
    }
}
