/*Строка "PAYPALISHIRING" записывается в виде зигзагообразного рисунка на заданном количестве строк следующим образом:
(возможно, вы захотите отобразить этот рисунок фиксированным шрифтом для лучшей разборчивости)

        P   A   H   N
        A P L S I I G
        Y   I   R

        А затем считывать строку за строкой: "PAHNAPLSIIGYIR"

        Напишите код, который будет принимать строку, и выполните это преобразование с учетом количества строк:
        string convert (string s, int numRows);


        Пример 1:

        Ввод: s = "PAYPALISHIRING", numRows = 3
        Вывод: "PAHNAPLSIIGYIR"

        Пример 2:

        Ввод: s = "PAYPALISHIRING", numRows = 4
        Вывод: "PINALSIGYAHRPI"
        Объяснение:
        P     I     N
        A   L S   I G
        Y A   H R
        P     I

        Пример 3:

        Ввод: s = "A", numRows = 1
        Вывод: "A"


        Ограничения:

        1 <= s.length <= 1000
        s состоит из английских букв (строчных и прописных), ',' и '.'.
        1 <= numRows <= 1000*/

package tasks;

import java.util.Map;

public class ZigzagConversion__6 implements Task{
    @Override
    public String execute(Map params) {
        return convert((String) params.get("value1"),(int) params.get("value2"));
    }

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        int increment = (numRows-1)*2;
        StringBuilder result = new StringBuilder();

        for (int r = 0; r < numRows; r++){

            for (int i = r; i < s.length(); i+=increment){
                result.append(s.charAt(i));
                if(r > 0 && r < (numRows-1) && (i+increment-2*r)<s.length()){
                    result.append(s.charAt(i+(increment -2*r)));
                }

            }
        }

        return result.toString();
    }
}
