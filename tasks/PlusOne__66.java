/*Вам выдается большое целое число, представленное в виде целочисленного массива digits,
где каждое digits[i] является ith цифрой целого числа.
Цифры упорядочены от наиболее значимых к наименее значимым слева направо.
Большое целое число не содержит никаких ведущих 0символов.
Увеличьте большое целое число на единицу и верните результирующий массив цифр.

        Пример 1:

        Ввод: цифры = [1,2,3]
        Вывод: [1,2,4]
        Пояснение: Массив представляет целое число 123.
        Увеличение на единицу дает 123 + 1 = 124.
        Таким образом, результатом должно быть [1,2,4].
        Пример 2:

        Ввод: цифры = [4,3,2,1]
        Вывод: [4,3,2,2]
        Пояснение: Массив представляет целое число 4321.
        Увеличение на единицу дает 4321 + 1 = 4322.
        Таким образом, результатом должно быть [4,3,2,2].
        Пример 3:

        Ввод: цифры = [9]
        Вывод: [1,0]
        Пояснение: Массив представляет целое число 9.
        Увеличение на единицу дает 9 + 1 = 10.
        Таким образом, результат должен быть [1,0].


        Ограничения:

        1 <= digits.length <= 100
        0 <= digits[i] <= 9
        digits не содержит никаких ведущих 0 букв.*/

package tasks;

import java.util.Arrays;
import java.util.Map;

public class PlusOne__66 implements Task{
    @Override
    public String execute(Map params) {
        return Arrays.toString(plusOne((int[]) params.get("value")));
    }

    public int[] plusOne(int[] digits) {
//        мой код
        int oversize = 0;
        int length = digits.length-1;

        for(int i = length; i>=0;i--){
            int sum = 0;
            if(i==length)
                sum = digits[i]+ 1;
            else
                sum = digits[i] + oversize;

            int digit = sum%10;
            oversize = sum/10;
            digits[i] = digit;
        }
        if(oversize>0){
            int[] res = new int[digits.length+1];
            for(int i = 0; i<res.length;i++){
                if(i == 0){
                    res[i] = oversize;
                }else{
                    res[i] = digits[i-1];
                }
            }
            return res;
        }
        return digits;

//        int n = digits.length;
//
//        for(int i = n-1; i >=0; i--){
//            if(digits[i] < 9){
//                digits[i]++;
//                return digits;
//            }
//            else{
//                digits[i] = 0;
//            }
//        }
//
//        int[] result = new int[n+1];
//        result[0] = 1;
//        for(int i=1; i < n+1; i++){
//            result[i] = 0;
//        }
//        return result;
    }
}
