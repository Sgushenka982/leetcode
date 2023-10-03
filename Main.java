import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Task task = new LongestCommonPrefix14();

        Map params = new HashMap<>();
        params.put("value",new String[]{"ab","a"});

        System.out.println(task.execute(params));
    }
}
