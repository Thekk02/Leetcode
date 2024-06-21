package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 杨辉三角行递推
 * @date 2024-6-18 08:37:24
 */
public class sln119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> cur = new ArrayList<Integer>();
        for(int i = 0;i < rowIndex +1;i++){
            List<Integer> per = new ArrayList<Integer>();
            for(int j = 0;j<i+1;j++){
                if(j == 0 || j == i){
                    per.add(1);
                }else{
                    per.add(cur.get(j-1)+cur.get(j));
                }
            }
            cur = per;
        }
        return cur;
    }
}
