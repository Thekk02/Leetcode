package solution;

/**
 * @author kk
 * @description IP地址无效化
 * @date 2024-11-4 10:42:08
 */
public class sln1108 {
    public String defangIPaddr(String address) {
        char[] ch = address.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < ch.length;i++){
            if(ch[i] == '.'){
                sb.append("[.]");
            }else{
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}
