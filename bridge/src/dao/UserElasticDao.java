package dao;

import model.User;

public class UserElasticDao implements UserDao{

    @Override
    public void save(User user) {
        System.out.println("Saving user in the Elastic database ");
    }
    
}
