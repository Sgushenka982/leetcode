package tasks;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Task task = new RemoveDuplicatesFromSortedArrayII__80();

        Map params = new HashMap<>();
        params.put("value",new int[]{0,1});

        System.out.println(task.execute(params));
    }
}
