package solution;

/**
 * @author kk
 * @description 执行操作后的变量值
 * @date 2024-11-1 09:31:03
 */
public class sln2011 {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for(String str: operations){
            if(str.charAt(1) == '+'){
                ans++;
            }else{
                ans--;
            }
        }
        return ans;
    }
}
