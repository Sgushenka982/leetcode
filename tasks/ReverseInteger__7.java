package tasks;

import java.util.Map;

public class ReverseInteger__7 implements Task{
    @Override
    public String execute(Map params) {
        return String.valueOf(reverse((int) params.get("value1")));
    }

    public int reverse(int x) {
        if (x==0) return 0;

        StringBuilder result = new StringBuilder();

        if(x<0) result.append("-");

        x = Math.abs(x);

        while (x>0){
            result.append(x%10);
            x/=10;
        }

        try {
            return Integer.parseInt(result.toString());
        }catch (NumberFormatException ex){
            return 0;
        }
    }
}
