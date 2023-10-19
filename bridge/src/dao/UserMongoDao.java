package dao;

import model.User;

public class UserMongoDao implements UserDao{

    @Override
    public void save(User user) {
        System.out.println("Saving user in the Mongo database ");
    }
    
}
