import java.util.ArrayList;
import java.util.List;

public class UserStorage {

    private static final List<User> users = new ArrayList<>();

    public static void addUser(User user) {
        users.add(user);
    }

    public static String toStringStorage() {
        StringBuilder sb = new StringBuilder();
        for (User user : users) {
            sb.append(user.toString());
        }
        return sb.toString();
    }
}
