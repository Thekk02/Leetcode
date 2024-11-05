package solution;

/**
 * @author kk
 * @description 大小为k且平均值大于等于阈值的子数组数目
 * @date 2024-11-5 13:15:40
 */
public class sln1343 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans;
        int sum = 0;
        for(int i= 0;i < k;i++){
            sum += arr[i];
        }
        if(sum >= k * threshold){
            ans =1;
        }else{
            ans =0;
        }
        for(int i = k;i < arr.length;i++){
            sum += (arr[i] - arr[i-k]);
            if(sum >= k * threshold){
                ans++;
            }
        }
        return ans;
    }
}
