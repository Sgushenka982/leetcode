package tasks;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Task task = new SqrtX__69();

        Map params = new HashMap<>();
        params.put("value", Integer.MAX_VALUE);

        System.out.println(task.execute(params));
    }
}
