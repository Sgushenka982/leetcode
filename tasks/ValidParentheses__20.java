/*Учитывая строку, s содержащую только символы '(', ')', '{' '}', '[' ']',,, определите, является ли введенная строка допустимой.

        Входная строка допустима, если:

        Открытые квадратные скобки должны быть закрыты скобками того же типа.
        Открытые квадратные скобки должны быть закрыты в правильном порядке.
        Каждой закрывающей скобке соответствует открывающая скобка того же типа.


        Пример 1:

        Ввод: s = "()"
        Вывод: true
        Пример 2:

        Ввод: s = "()[]{}"
        Вывод: true
        Пример 3:

        Ввод: s = "(]"
        Вывод: false


        Ограничения:

        1 <= s.length <= 104
        s состоит только из круглых скобок '()[]{}'.*/

package tasks;

import java.util.*;

import static java.util.Map.entry;

public class ValidParentheses__20 implements Task{
    @Override
    public String execute(Map params) {
        return String.valueOf(isValid((String)params.get("value")));
    }

    public boolean isValid(String s) {
        //мое решение
        /*Map<String, String> bracketMap = Map.ofEntries(
                entry(")", "("),
                entry("]", "["),
                entry("}", "{")
        );*/
        Map<String, String> bracketMap = new HashMap<String, String>();
        bracketMap.put(")", "(");
        bracketMap.put("]", "[");
        bracketMap.put("}", "{");

        List<String> incoming = new ArrayList<>();

        for(int i = 0; i<s.length();i++){
            String bracket = String.valueOf(s.charAt(i));
            if(incoming.isEmpty() && bracketMap.get(bracket)!=null){
                return false;
            }else if(bracketMap.get(bracket)!=null){
                if(incoming.get(incoming.size()-1).equals(bracketMap.get(bracket))){
                    incoming.remove(incoming.size()-1);
                }else{
                    return false;
                }
            }else{
                incoming.add(bracket);
            }
        }

        return incoming.isEmpty();
    }
}
