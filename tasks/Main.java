package tasks;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Task task = new RemoveDuplicatesFromSortedArray__26();

        Map params = new HashMap<>();
        params.put("value",new int[]{0,0,1,1,1,2,2,3,3,4});

        System.out.println(task.execute(params));
    }
}
