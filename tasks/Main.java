package tasks;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Task task = new FindTheIndexOfTheFirstOccurrenceInAString__28();

        Map params = new HashMap<>();
        params.put("value1", "abc");
        params.put("value2", "c");

        System.out.println(task.execute(params));
    }
}
