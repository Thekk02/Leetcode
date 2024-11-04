package solution;

/**
 * @author kk
 * @description 将每个元素替换为右侧最大元素
 * @date 2024-11-4 11:32:19
 */
public class sln1299 {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for(int i = arr.length;i >= 0;i++){
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(temp,max);
        }
        return arr;
    }
}
