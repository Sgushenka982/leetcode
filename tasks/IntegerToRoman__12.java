package tasks;/*Римские цифры представлены семью различными символами: I, V, X L, C D M,,,,,,,,,,,,,,, и,,,,.

        Значение       символа
        I 1
        V 5
        X 10
        L 50
        C 100
        D 500
        M 1000
        Например, 2 записывается как II римскими цифрами, просто складываются две единицы. 12 записывается как XII, то есть просто X + II.
        Число 27 записывается как XXVII, что XX + V + II равно.
        Римские цифры обычно записываются слева направо от наибольшего к наименьшему.
        Однако цифра для четырех таковой не является IIII. Вместо этого число четыре записывается как IV. Поскольку единица стоит перед пятеркой, мы вычитаем ее, получая четыре. Тот же принцип применим к числу девять, которое записывается как IX. Существует шесть случаев, когда используется вычитание:

        I может быть помещено перед V (5) и X (10), чтобы получились 4 и 9.
        X может быть помещено перед L (50) и C (100), чтобы составить 40 и 90.
        C может быть помещено перед D (500) и M (1000), чтобы получить 400 и 900.
        Учитывая целое число, преобразуйте его в римскую цифру.

        Пример 1:

        Ввод: число = 3
        Вывод: "III"
        Объяснение: 3 представлено как 3 единицы.

        Пример 2:

        Ввод: число = 58
        Вывод: "LVIII"
        Объяснение: L = 50, V = 5, III = 3.

        Пример 3:

        Ввод: число = 1994
        Вывод: "MCMXCIV"
        Объяснение: M = 1000, CM = 900, XC = 90 и IV = 4.


        Ограничения:

        1 <= num <= 3999*/

import java.util.Map;

public class IntegerToRoman__12 implements Task {

    public  String intToRoman(int num) {
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols = {"M","CM","D","CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();

        for(int i = 0;i<nums.length && num>0;i++){
//            while(num>=nums[i]){
//                num-=nums[i];
//                result.append(symbols[i]);
//            }
            if(num/nums[i]>0){
                int count =  num/nums[i];
                num %=nums[i];
                result.append(new String(new char[count]).replace("\0", symbols[i] ));
            }
        }
        return result.toString();
    }

    @Override
    public String execute(Map params) {
        return intToRoman((int) params.get("value"));
    }
}