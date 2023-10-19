package dao;

import model.User;

public class UserPostgresDao implements UserDao{

    @Override
    public void save(User user) {
        System.out.println("Saving user in the Postgres database ");
    }
    
}
