import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Task task = new LongestSubstringWithoutRepeatingCharacters3();

        Map params = new HashMap<>();
        params.put("value","tmmzuxt");

        System.out.println(task.execute(params));
    }
}
