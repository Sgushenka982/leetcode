/*Учитывая строку s, найдите длину самой длинной подстроки без повторяющихся символов.

        Пример 1:

        Ввод: s = "abcabcbb"
        Вывод:3
        Объяснение: ответом будет "abc" длиной 3.
        Пример 2:

        Ввод: s = "bbbbb"
        Вывод:1
        Объяснение: ответом будет "b" длиной 1.
        Пример 3:

        Ввод: s = "pwwkew"
        Вывод:3
        Объяснение: Ответ "wke" длиной 3.
        Обратите внимание, что ответ должен быть подстрокой, "pwke" - это подпоследовательность, а не подстрока.


        Ограничения:

        0 <= s.length <= 5 * 104
        s состоит из английских букв, цифр, символов и пробелов.*/

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters3 implements Task{
    @Override
    public String execute(Map params) {
        return String.valueOf(lengthOfLongestSubstring((String)params.get("value")));
    }

    public int lengthOfLongestSubstring(String s) {
//        int maxLength = 0;
//        Set<Character> charSet = new HashSet<>();
//        int left = 0;
//
//        for( int right = 0; right<s.length();right++){
//            if(!charSet.contains(s.charAt(right))){
//                charSet.add(s.charAt(right));
//                if(maxLength < (right-left+1)) maxLength=(right-left+1);
//            }else {
//                while (charSet.contains(s.charAt(right))) {
//                    charSet.remove(s.charAt(left));
//                    left++;
//                }
//                charSet.add(s.charAt(right));
//            }
//        }

//        int maxLength = 0;
//        Map<Character, Integer> charMap = new HashMap<>();
//        int left = 0;
//
//        for( int right = 0; right<s.length();right++){
//            if(!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left){ //найденный символ должен быть меньше левого указателя поскольку он встречался в прошлых подстроках
//                charMap.put(s.charAt(right), right);
//                if(maxLength < (right-left+1)) maxLength=(right-left+1);
//            }else{
//                left = charMap.get(s.charAt(right))+1;
//                charMap.put(s.charAt(right), right);
//            }
//        }


        //хз как работает 3 метод
        int maxLength = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            if (charIndex[s.charAt(right)] >= left) {
                left = charIndex[s.charAt(right)] + 1;
            }
            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
