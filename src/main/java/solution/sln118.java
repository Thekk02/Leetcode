package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 杨辉三角
 * @date 2024-6-18 08:20:00
 */
public class sln118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i = 0;i < numRows;i++){
            List<Integer> list = new ArrayList<Integer>();
            for(int j = 0;j < i+1;j++){
                if(j == 0 || j == i){
                    list.add(1);
                }
                else{
                    list.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
                }
            }
            ans.add(list);
        }
        return ans;
    }
}
