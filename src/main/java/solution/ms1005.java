package solution;

/**
 * @author kk
 * @description 稀疏数组搜索
 * @date 2024-11-5 10:09:18
 */
public class ms1005 {
    public int findString(String[] words, String s) {
        for(int i = 0;i < words.length;i++){
            if(words[i].equals(s)){
                return i;
            }
        }
        return -1;
    }
}
