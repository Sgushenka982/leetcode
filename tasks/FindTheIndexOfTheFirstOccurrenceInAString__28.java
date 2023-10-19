/*Учитывая две строки needle и haystack, верните индекс первого вхождения needle в haystack, или, -1 если needle он не является частью haystack.

        Пример 1:

        Входные данные: haystack = "sadbutsad", needle = "грустный"
        Вывод:0
        Объяснение: "sad" встречается с индексами 0 и 6.
        Первое вхождение находится с индексом 0, поэтому мы возвращаем 0.
        Пример 2:

        Входные данные: haystack = "leetcode", needle = "leeto"
        Вывод:-1
        Объяснение: "leeto" не встречается в "leetcode", поэтому мы возвращаем -1.


        Ограничения:

        1 <= haystack.length, needle.length <= 104
        haystack и needle состоят только из строчных английских символов.*/

package tasks;

import java.util.Map;

public class FindTheIndexOfTheFirstOccurrenceInAString__28 implements Task{
    @Override
    public String execute(Map params) {
        return String.valueOf(strStr((String)params.get("value1"), (String) params.get("value2")));
    }

    public int strStr(String haystack, String needle) {
//        мое решение
        /*if(haystack.length() == needle.length() && haystack.equals(needle)){
            return 0;
        }

        int index =0;

        for(int i =0; i< (haystack.length()-needle.length()+1);i++){
            for (int j = 0; j < needle.length();j++){
                int tmpIndex = i + j;
                if(i==haystack.length()-needle.length() && needle.charAt(j) != haystack.charAt(tmpIndex)){
                    return -1;
                }else if(needle.charAt(j) != haystack.charAt(tmpIndex)){
                    tmpIndex++;
                    break;
                }else if(j+1 == needle.length() && needle.charAt(j) == haystack.charAt(tmpIndex)) {
                    return index;
                }
            }
            index++;
        }

        return -1;*/

        return haystack.indexOf(needle);
    }
}
