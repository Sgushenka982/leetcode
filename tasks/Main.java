package tasks;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Task task = new LongestPalindromicSubstring__5();

        Map params = new HashMap<>();
        params.put("value","aa");

        System.out.println(task.execute(params));
    }
}
