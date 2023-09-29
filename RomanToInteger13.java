/*Римские цифры представлены семью различными символами:I,V,X L,C D M,,,,,,,,,,,,,,,и,,,,.

        Значение символа
        I 1
        V 5
        X 10
        L 50
        C 100
        D 500
        M 1000
        Например,2 записывается как II римскими цифрами, просто складываются две единицы. 12записывается как XII, что просто X+II. Число 27записывается как XXVII, что XX+V+II равно.

        Римские цифры обычно записываются от наибольшего к наименьшему слева направо. Однако цифра для четырех таковой не является IIII. Вместо этого число четыре записывается как IV.
        Поскольку единица стоит перед пятеркой, мы вычитаем ее, получая четыре. Тот же принцип применим к числу девять, которое записывается как IX.
        Существует шесть случаев, когда используется вычитание:

        I может быть помещен перед V(5)и X(10),чтобы получились 4и 9.
        X может быть помещен перед L(50)и C(100),чтобы составить 40и 90.
        C может быть помещен перед D(500)и M(1000),чтобы получились 400и 900.
        Учитывая римскую цифру, преобразуйте ее в целое число.

        Пример 1:
        Ввод:s="III"
        Результат:3
        Объяснение:III=3.

        Пример 2:
        Ввод:s="LVIII"
        Вывод:58
        Объяснение:L=50,V=5,III=3.

        Пример 3:
        Ввод:s="MCMXCIV"
        Результат:1994
        Объяснение:M=1000,CM=900,XC=90и IV=4.*/

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger13 implements Task{

    @Override
    public String execute(Map params) {
        return romanToInt((String) params.get("value")).toString();
    }

    public Integer romanToInt(String s) {
        int result = 0;
        int current = 0;
        int prev = 0;

        for(int i=s.length()-1; i>=0;i--){
            current=symbols.get(s.charAt(i));
            if(current<prev)
                result-=current;
            else
                result+=current;

            prev=current;
        }

        return result;
    }

    Map<Character, Integer> symbols = new HashMap<>();
    {
        symbols.put('I', 1);
        symbols.put('V', 5);
        symbols.put('X', 10);
        symbols.put('L', 50);
        symbols.put('C', 100);
        symbols.put('D', 500);
        symbols.put('M', 1000);
    }

//    public int convertRomanSymbolToInt(char symbol){
//        switch(symbol){
//            case 'I':
//                return 1;
//            case 'V':
//                return 5;
//            case 'X':
//                return 10;
//            case 'L':
//                return 50;
//            case 'C':
//                return 100;
//            case 'D':
//                return 500;
//            case 'M':
//                return 1000;
//            default:
//                return 0;
//        }
//    }
}