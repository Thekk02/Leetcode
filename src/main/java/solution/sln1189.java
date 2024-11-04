package solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kk
 * @description 气球的最大数量
 * @date 2024-11-4 11:08:42
 */
public class sln1189 {
    public int maxNumberOfBalloons(String text) {
        int[] cnt = new int[5];
        for(int i = 0;i < text.length();++i){
            char ch = text.charAt(i);
            if(ch == 'b'){
                cnt[0]++;
            }else if(ch == 'a'){
                cnt[1]++;
            }else if(ch == 'l'){
                cnt[2]++;
            }else if(ch == 'o'){
                cnt[3]++;
            }else{
                cnt[4]++;
            }
        }
        cnt[2] /= 2;
        cnt[3] /= 2;
        return Arrays.stream(cnt).min().getAsInt();
    }
}
