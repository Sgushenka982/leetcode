package tasks;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Task task = new SqrtX__69();

        Map params = new HashMap<>();
        params.put("value", 2147395648);

        System.out.println(task.execute(params));
    }
}
