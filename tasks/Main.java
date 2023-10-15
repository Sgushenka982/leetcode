package tasks;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Task task = new ValidParentheses__20();

        Map params = new HashMap<>();
        params.put("value","[");

        System.out.println(task.execute(params));
    }
}
