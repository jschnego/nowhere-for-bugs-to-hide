import java.util.List;

public class LikesFormatter {
    public static String format(List<String> users) {
        String name = users.isEmpty() ? "No one" : concatenate(users);
        String suffix = users.size() > 1 ? "" : "s";
        return String.format("%s like%s this", name, suffix);
    }

    private static String concatenate(List<String> users) {
        return String.join(" and ", users);
    }
}
