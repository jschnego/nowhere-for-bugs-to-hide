import java.util.List;

public class LikesFormatter {
    public static String format(List<String> users) {
        String name = users.isEmpty() ? "No one" : concatenate(users);
        String suffix = users.size() > 1 ? "" : "s";
        return String.format("%s like%s this", name, suffix);
    }

    private static String concatenate(List<String> users) {
        String joined = String.join(" and ", users);
        if (users.size() == 3) {
            joined = joined.replaceFirst(" and ", ", ");
        }
        return joined;
    }
}
