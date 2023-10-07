package tasks;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Task task = new ZigzagConversion__6();

        Map params = new HashMap<>();
        params.put("value1","PAYPALISHIRING");
        params.put("value2",4);

        System.out.println(task.execute(params));
    }
}
