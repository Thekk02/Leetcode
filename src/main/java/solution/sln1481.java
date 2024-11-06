package solution;

import java.util.*;

/**
 * @author kk
 * @description 不同整数的最少数目
 * @date 2024-11-6 08:46:20
 */
public class sln1481 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0) + 1);
        }
        List<Integer> temp = new ArrayList<>(map.size());
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            temp.add(entry.getValue());
        }
        temp.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        for(int i = 0;i < temp.size();i++){
            if(temp.get(i) <=k){
                k -= temp.get(i);
                temp.remove(i);
            }else{
                return temp.size();
            }
        }
        return 0;
    }
}
