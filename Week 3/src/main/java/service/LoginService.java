package service;
import model.user.Role;
import model.user.User;

public class LoginService {
    public boolean checkLogin(User user) {
        if(user.getUsername().equals("admin")) {
            if(user.getPassword().equals("admin")) {
                user.setRole(Role.ADMIN);
                return true;
            }
            return false;
        }
        else if(user.getUsername().equals("guest")) {
            if(user.getPassword().isEmpty()) {
                user.setRole(Role.GUEST);
                return true;
            }
            return false;
        }
        return false;
    }
}
