import java.util.List;

public class LikesFormatter {
    public static String format(List<String> users) {
        String suffix = users.size() > 1 ? "" : "s";
        return String.format("%s like%s this", concatenate(users), suffix);
    }

    private static String concatenate(List<String> users) {
        switch (users.size()) {
            case 0:
                return "No one";
            case 1:
                return users.get(0);
            case 2:
                return String.format("%s and %s", users.get(0), users.get(1));
            case 3:
                return String.format("%s, %s and %s", users.get(0), users.get(1), users.get(2));
            default:
                return String.format("%s, %s and %s others", users.get(0), users.get(1), users.size() - 2);
        }
    }
}
