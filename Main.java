import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Task task = new PalindromeNumber9();

        Map<String, Integer> params = new HashMap<>();
        params.put("value",9987654321);

        System.out.println(task.execute(params));
    }
}
