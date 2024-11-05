package solution;

/**
 * @author kk
 * @description 比较含退格的字符串
 * @date 2024-11-5 09:46:07
 */
public class sln844 {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '#'){
                if(sb1.length() == 0){

                }
                else{
                    sb1.deleteCharAt(sb1.length());
                }
            }
            else{
                sb1.append(s.charAt(i));
            }
        }
        for(int i = 0;i < t.length();i++){
            if(t.charAt(i) == '#'){
                if(sb2.length() == 0){

                }else{
                    sb2.deleteCharAt(sb1.length());
                }
            }
            else{
                sb2.append(t.charAt(i));
            }
        }
        return sb1.toString().equals(sb2.toString());
    }

}
