package service;

import dao.UserDao;
import model.User;

public class UserEJBService extends UserService {

    public UserEJBService(UserDao dao) {
        super(dao);
    }

    @Override
    public void save(User user) {
        System.out.println("Starting a save operation through EJB protocol");
        dao.save(user);
    }
    
}
