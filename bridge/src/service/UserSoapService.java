package service;

import dao.UserDao;
import model.User;

public class UserSoapService extends UserService {

    public UserSoapService(UserDao dao) {
        super(dao);
    }

    @Override
    public void save(User user) {
        System.out.println("Starting a save operation through Soap protocol");
        dao.save(user);
    }
    
}
