package solution;

/**
 * @author kk
 * @description 计数质数
 * @date 2024-10-22 10:08:58
 */
public class sln204 {
    public int countPrimes(int n) {
        int ans = 0;
        for(int i =2;i < n;i++){
            ans += isPrime(i) ? 1 : 0;
        }
        return ans;
    }
    boolean isPrime(int x){
        for(int i =2 ;i * i <= x;i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}
