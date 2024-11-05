package solution;

/**
 * @author kk
 * @description 动态口令
 * @date 2024-11-5 10:20:47
 */
public class LCR182 {
    public String dynamicPassword(String password, int target) {
        return password.substring(target,password.length()) + password.substring(0,target);
    }
}
