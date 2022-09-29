import java.util.List;

public class LikesFormatter {
    public static String format(List<String> users) {
        String name = users.isEmpty() ? "No one" : users.get(0);
        return String.format("%s likes this", name);
    }
}
