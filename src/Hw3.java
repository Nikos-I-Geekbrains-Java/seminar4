import java.util.Deque;
import java.util.LinkedList;

public class Hw3 {

    public static String simplifyPath(String path) {
        Deque<String> deq = new LinkedList<>();
        String[] tokens = path.split("/");
        for (var token : tokens) {
            if ("..".equals(token)) {
                if (!deq.isEmpty()) {
                    deq.pollLast();
                }
            } else if (!"".equals(token) && !".".equals(token)) {
                deq.addLast(token);
            }
        }
        if (deq.isEmpty()) {
            return "/";
        }

        StringBuilder ans = new StringBuilder();
        while (!deq.isEmpty()) {
            ans.append("/").append(deq.pollFirst());
        }
        return ans.toString();
    }
}
