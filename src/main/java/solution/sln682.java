package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kk
 * @description 棒球比赛
 * @date 2024-10-15 09:36:29
 */
public class sln682 {
    public int calPoints(String[] operations) {
        int ans = 0;
        List<Integer> points = new ArrayList<>();
        for(String op : operations){
            int n = points.size();
            switch (op.charAt(0)){
                case '+' :
                    ans += points.get(n-2) + points.get(n - 1);
                    points.add(points.get(n-2) + points.get(n-1));
                    break;
                case 'D' :
                    ans += points.get(n -1) * 2;
                    points.add(points.get(n-1) * 2);
                    break;
                case 'C' :
                    ans -= points.get(n -1);
                    points.remove(n-1);
                    break;
                default:
                    ans += Integer.parseInt(op);
                    points.add(Integer.parseInt(op));
                    break;
            }

        }
        return ans;
    }
}
