package tasks;
//Учитывая массив целых nums чисел и целое число target, верните индексы двух чисел так, чтобы они в сумме равнялись target.
//        Вы можете предположить, что каждый ввод будет иметь ровно одно решение, и вы не можете использовать один и тот же элемент дважды.
//        Вы можете вернуть ответ в любом порядке.

//        Пример 1:
//        Входные данные: числа = [2,7,11,15], цель = 9
//        Вывод: [0,1]
//        Объяснение: поскольку числа [0] + числа [1] == 9, мы возвращаем [0, 1].

//        Пример 2:
//        Входные данные: числа = [3,2,4], цель = 6
//        Вывод: [1,2]

//        Пример 3:
//        Входные данные: числа = [3,3], цель = 6
//        Вывод: [0,1]

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum__1 implements Task{
    @Override
    public String execute(Map params) {
        String result = Arrays.toString(twoSum((int[]) params.get("nums"), (Integer) params.get("target")));
        return result;
    }

    public int[] twoSum(int[] nums, int target) {
        //O(n^2)

//        for(int i = 0; i<nums.length;i++){
//            for(int j = i+1; j<nums.length;j++){
//                if((nums[i]+nums[j])==target) return new int[]{i,j};
//            }
//        }

        //O(n)

         Map<Integer, Integer> map = new HashMap<>();

         for(int i = 0; i<nums.length;i++){
             if(map.containsKey(target-nums[i])){
                 return new int[]{map.get(target-nums[i]) ,i};
             }
             map.put(nums[i],i);
         }
         return new int[2];
    }
}