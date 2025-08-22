package model.user;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private String username;
    private String password;
    private Role role;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
