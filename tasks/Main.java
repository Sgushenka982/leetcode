package tasks;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Task task = new ReverseInteger__7();

        Map params = new HashMap<>();
        params.put("value1",1534236469);

        System.out.println(task.execute(params));
    }
}
