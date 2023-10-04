package tasks;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Task task = new MedianOfTwoSortedArrays__4();

        Map params = new HashMap<>();
        params.put("list1",new int[]{1,2,3,4});
        params.put("list2",new int[]{5,6,7,8,9,10,11,12});

        System.out.println(task.execute(params));
    }
}
