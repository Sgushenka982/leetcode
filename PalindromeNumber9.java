/*Задано целое число x, верните, true если x это палиндром в противном случаеfalse, и.

        Пример 1:

        Ввод: x = 121
        Вывод:истина
        Пояснение: 121 читается как 121 слева направо и справа налево.
        Пример 2:

        Ввод: x = -121
        Вывод:false
        Объяснение: Слева направо написано -121. Справа налево он становится 121-. Следовательно, это не палиндром.
        Пример 3:

        Ввод: x = 10
        Вывод:false
        Объяснение: Читается 01 справа налево. Следовательно, это не палиндром.


        Ограничения:

        -231 <= x <= 231 - 1


        Продолжение: Могли бы вы решить эту задачу без преобразования целого числа в строку?*/

import java.util.Map;

public class PalindromeNumber9 implements Task {

//        int x = 124;
//        System.out.println(isPalindrome(x));

//        String[] arr1 = String.valueOf(x).split("");
//        List<String> list = Arrays.asList(arr1);
//        ListIterator<String> iterator = list.listIterator();
//        ListIterator<String> reverseIterator = list.listIterator(list.size());
//
//        while(iterator.hasNext()&& reverseIterator.hasPrevious()){
//            if(!Objects.equals(iterator.next(), reverseIterator.previous())){
//                System.out.println(false);
//                break;
//            }
//        }
//        System.out.println(true);

//    }

    public Boolean isPalindrome(int x){
        if(x<0) return false;

//        String[] arr1 = String.valueOf(x).split("");
//
//        int n = arr1.length%2==0 ? arr1.length/2 : arr1.length/2+1;
//
//        for(int i=0;i<n;i++){
//            if(!arr1[i].equals(arr1[arr1.length - (i + 1)])){
//                return false;
//            }
//        }
//
//        return true;


        int copyX = x;
        StringBuilder sb = new StringBuilder();
        while (copyX/10>0){
            sb.append(copyX % 10);
            copyX /= 10;
        }
        sb.append(copyX);

        if (Integer.valueOf(sb.toString()) == x)
            return true;
        else
            return false;
    }

    @Override
    public String execute(Map params) {
        return isPalindrome((int)params.get("value")).toString();
    }
}