package solution;

/**
 * @author kk
 * @description 6和9组成的最大数字
 * @date 2024-11-4 10:18:20
 */
public class sln1323 {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        char[] ch = s.toCharArray();
        for(int i = 0;i < ch.length;i++){
            if(ch[i] == '6'){
                ch[i] = '9';
                return Integer.parseInt(String.valueOf(ch));
            }
        }
        return num;
    }

}
