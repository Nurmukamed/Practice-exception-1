package TaskSecond;
public class User {
    private final String login;
    private final String password;
    private final String email;
    private final int age;
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }
    public int getAge() {
        return age;
    }
    public User(String login, String password, String email, int age) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }
}
