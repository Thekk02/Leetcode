package solution;

/**
 * @author kk
 * @description 点名1
 * @date 2024-11-4 08:23:39
 */
public class LCR173 {
    public int takeAttendance(int[] records) {
        int n = records.length;
        for(int i = 0;i < n;i++){
            if(records[i] != i){
                return i;
            }
        }
        return -1;
    }
}
