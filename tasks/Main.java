package tasks;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Task task = new PlusOne__66();

        Map params = new HashMap<>();
        params.put("value", new int[]{9,9});

        System.out.println(task.execute(params));
    }
}
