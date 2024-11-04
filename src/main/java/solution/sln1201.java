package solution;

/**
 * @author kk
 * @description 丑数3
 * @date 2024-10-28 08:11:26
 */
public class sln1201 {
    public int nthUglyNumber(int n, int a, int b, int c) {
        int num = 0;
        int start = 0;
        while(true){
            if(start % a ==0||start % b == 0||start % c ==0){
                num += 1;
            }
            if(num == n){
                return start;
            }
            start++;
        }
    }
}
