package solution;

import java.util.Arrays;

/**
 * @author kk
 * @description 寻找比目标字母大的最小字母
 * @date 2024-10-22 08:22:11
 */
public class sln744 {
    public char nextGreatestLetter(char[] letters, char target) {
        char[] temp = Arrays.copyOf(letters,letters.length);
        Arrays.sort(letters);
        for(int i = 0;i < letters.length;i++){
            if(letters[i] > target){
                return letters[i];
            }
        }
        return temp[0];
    }
}
