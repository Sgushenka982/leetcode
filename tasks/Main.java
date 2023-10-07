package tasks;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Task task = new RemoveElement__27();

        Map params = new HashMap<>();
        params.put("value1",new int[]{3,2,2,3});
        params.put("value2",3);

        System.out.println(task.execute(params));
    }
}
