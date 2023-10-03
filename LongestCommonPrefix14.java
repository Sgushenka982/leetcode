/*Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".

        Example 1:

        Input: strs = ["flower","flow","flight"]
        Output: "fl"

        Example 2:

        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.


        Constraints:

        1 <= strs.length <= 200
        0 <= strs[i].length <= 200
        strs[i] consists of only lowercase English letters.*/

import java.util.Map;

public class LongestCommonPrefix14 implements Task{
    @Override
    public String execute(Map params) {
        return longestCommonPrefix((String[]) params.get("value"));
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length ==0)
            return "";

        StringBuilder result = new StringBuilder();
//        for(int i = 0; i<strs.length;i++){
//            while(strs[i].indexOf(result) != 0){
//                result = result.substring(0, result.length() -1);
//                if(result.isEmpty())
//                    return "";
//            }
//        }
        for (int i = 0; i<strs[0].length();i++){
            char symb = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if (strs[j].length() <= i || strs[j].charAt(i) != symb)
                    return result.toString();
            }
            result.append(symb);
        }

        return result.toString();
    }
}
