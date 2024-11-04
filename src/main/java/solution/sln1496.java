package solution;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kk
 * @description 判断路径是否相交
 * @date 2024-10-28 10:36:51
 */
public class sln1496 {
    public boolean isPathCrossing(String path) {
        Set<Integer> vis = new HashSet<>();
        int x = 0,y = 0;
        vis.add(getHash(x,y));
        int length = path.length();
        for(int i = 0;i < length;i++){
            Character ch = path.charAt(i);
            switch (ch){
                case 'N': y++;break;
                case 'S': y--;break;
                case 'W': x--;break;
                case 'E': x++;break;
            }int hashValue = getHash(x,y);
            if(!vis.add(hashValue)){
                return true;
            }
        }
        return false;
    }
    public int getHash(int x,int y){
        return x*20001 + y;
    }
}
