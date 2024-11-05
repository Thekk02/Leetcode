package solution;

/**
 * @author kk
 * @description 第k个缺失的正整数
 * @date 2024-11-5 10:37:02
 */
public class sln1539 {
    public int findKthPositive(int[] arr, int k) {
        int[] temp = new int[2000];
        for(int i = 0;i < arr.length;i++){
            temp[arr[i]] = 1;
        }
        for(int i = 1;i < 2000;i++){
            if(k == 0){
                return i;
            }
            if(temp[i] == 0){
                k--;
            }
        }
        return 0;
    }
}
