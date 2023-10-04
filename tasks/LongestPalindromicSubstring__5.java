/*Given a string s, return the longest palindromic substring in s.

        Example 1:

        Input: s = "babad"
        Output: "bab"
        Explanation: "aba" is also a valid answer.

        Example 2:

        Input: s = "cbbd"
        Output: "bb"

        Constraints:

        1 <= s.length <= 1000
        s consist of only digits and English letters.*/

package tasks;

import java.util.Map;

public class LongestPalindromicSubstring__5 implements Task{
    @Override
    public String execute(Map params) {
        return longestPalindrome((String)params.get("value"));
    }

    public String longestPalindrome(String s) {

        String longestPalindrome ="";

        for(int i = 0; i<s.length();i++){
            String tmp = "";
            if(s.length()%2==0){
                tmp = getPalindrome(s,i,i+1);
            }else{
                tmp = getPalindrome(s,i,i);
            }

            longestPalindrome = tmp.length() > longestPalindrome.length() ? tmp : longestPalindrome;
        }

        return longestPalindrome;
    }

    public String getPalindrome(String s,int lPointer, int rPointer){
        while(lPointer >= 0 && rPointer < s.length() && s.charAt(lPointer) == s.charAt(rPointer)){
            lPointer--;
            rPointer++;
        }
        //не вошли в цикл, значит палиндром был индекс назад
        return s.substring(lPointer+1,rPointer);
    }
}
