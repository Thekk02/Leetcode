package solution;

/**
 * @author kk
 * @description 反转字符串中的元音字母
 * @date 2024-11-5 09:02:14
 */
public class sln345 {
    public String reverseVowels(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int i = 0,j = n -1;
        while(i < j){
            while(i < n && !isVowel(arr[i])){
                i++;
            }
            while(j > 0 && !isVowel(arr[j])){
                j--;
            }
            if(i < j){
                swap(arr,i,j);
            }
        }
        return new String(arr);
    }
    public boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch) >= 0;
    }
    public void swap(char[] arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
