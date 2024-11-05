package solution;

/**
 * @author kk
 * @description 两数之和2-输入有序数组
 * @date 2024-11-5 09:32:18
 */
public class LCR006 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0,r = numbers.length - 1;
        while(l <= r){
            if(numbers[l] + numbers[r] < target){
                l++;
            }
            else if(numbers[l] + numbers[r] > target){
                r--;
            }else{
                return new int[]{l,r};
            }
        }
        return null;
    }
}
