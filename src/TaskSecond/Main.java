package TaskSecond;
import java.util.Scanner;

public class Main {
    public static User[] getUsers() {
        User user1 = new User("alex", "pass123", "alexbest@gmail.com", 25);
        User user2 = new User("json", "pass456", "json@gamil.com", 20);
        User user3 = new User("lawler", "pass789", "lawl@gamil.com", 17);
        return new User[]{user1, user2, user3};
    }
    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("Access denied");
        }
    }

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the login:");
        String login = scanner.nextLine();
        System.out.println("Enter a password:");
        String password = scanner.nextLine();
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        User user = getUserByLoginAndPassword(login, password);
        validateUser(user);
        System.out.println("Access provided");
    }
}
