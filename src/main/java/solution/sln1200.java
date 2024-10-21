package solution;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kk
 * @description 最小绝对差
 * @date 2024-10-21 08:56:03
 */
public class sln1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i = 0;i < arr.length - 1;i++){
            if(arr[i+1] - arr[i] == min){
                List<Integer> list= new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i+1]);
                ans.add(list);
            }
            else if(arr[i+1] - arr[i] < min){
                min = arr[i+1] - arr[i];
                ans.clear();
                List<Integer> list= new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i+1]);
                ans.add(list);
            }
        }
        return ans;
    }

}
