package service;

import dao.UserDao;
import model.User;

public class UserRestService extends UserService {

    public UserRestService(UserDao dao) {
        super(dao);
    }

    @Override
    public void save(User user) {
        System.out.println("Starting a save operation through Rest protocol");
        dao.save(user);
    }
    
}
