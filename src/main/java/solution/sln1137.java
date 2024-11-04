package solution;

/**
 * @author kk
 * @description 第N个泰波那契数
 * @date 2024-10-28 15:46:55
 */
public class sln1137 {
    public int tribonacci(int n) {
        if(n == 0){return 0;}
        if(n <= 2){
            return 1;
        }
        int i = 0,j = 0,k =1,l = 1;
        for(int a = 3;a <= n;a++){
            i = j;
            j = k;
            k = l;
            l = i + j + k;
        }
        return l;
    }
}
