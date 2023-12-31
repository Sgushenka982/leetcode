/*Учитывая неотрицательное целое число, x верните квадратный корень из x округленный в меньшую сторону до ближайшего целого числа.
Возвращаемое целое число также должно быть неотрицательным.

Вы не должны использовать какую-либо встроенную функцию экспоненты или оператор.
Например, не используйте pow(x, 0.5) в c++ или x ** 0.5 в python.

        Пример 1:

        Ввод: x = 4
        Вывод:2
        Объяснение: Квадратный корень из 4 равен 2, поэтому мы возвращаем 2.

        Пример 2:

        Ввод: x = 8
        Вывод:2
        Пояснение: Квадратный корень из 8 равен 2.82842 ..., и поскольку мы округляем его в меньшую сторону до ближайшего целого числа, возвращается 2.

        Ограничения:

        0 <= x <= 2^(31 - 1)*/

package tasks;

import java.util.Map;

public class SqrtX__69 implements Task{
    @Override
    public String execute(Map params) {
        return String.valueOf(mySqrt((int)params.get("value")));
    }

    public int mySqrt(int x) {
//        в лоб
        /*int result = 0;

        while(result*result <= x){
            result++;
            if(result*result<0)
                return result-1;
        }

        return result-1;*/

        if (x==0 || x==1)
            return x;

        int left = 1;
        int right = x;
        int mid = -1;

        //пока указатели не встанут рядом
        while (right-left > 1){
            // ищем середину нашего диапазона
            mid = (int) (((long)left+right)/2);

            //если нашли нужное число, выводим
            if ((long)mid*mid == x)
                return mid;
            // ищем половину в которой нужный нам результат
            else if ((long) mid*mid > x)
                right = mid;
            else
                left = mid;

        }

        //берем левый указатель, потому что правый уже не подходит
        return left;
    }
}
