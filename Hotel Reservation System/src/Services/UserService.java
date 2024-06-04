package Services;

import DAO.UserDAO;
import Models.User;

public class UserService {
    private UserDAO userDAO = new UserDAO();

    public boolean login(String username, String password) {
        return userDAO.login(username, password);
    }

    public boolean register(User user) {
        return userDAO.register(user);
    }

}
