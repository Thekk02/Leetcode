package solution;

/**
 * @author kk
 * @description 柠檬水找零
 * @date 2024-10-22 13:15:04
 */
public class sln860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0,ten = 0;
        for(int bill:bills){
            if(bill == 5){
                five += 1;
            }else if(bill == 10){
                if(five == 0){
                    return false;
                }else{
                    five--;
                    ten++;
                }
            }else{
                if(five>0&&ten>0){
                    five--;
                    ten--;
                }else if(five >=3){
                    five -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
