package com.example.bond.repository;

import com.example.bond.entities.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDalImpl implements UserDal {

    @Autowired
    EntityManager entityManager;

    @Override
    public User getUserById(Integer id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(User.class,id);
    }
    @Override
    public List<User> getAllUsers() {
        Session session = entityManager.unwrap(Session.class);
        List<User> allUsers= session.createQuery(
                "SELECT e FROM User e", User.class).getResultList();
        return allUsers;
    }

    @Override
    public boolean checkUserExist(User user){
        boolean userExist=false;
        for (User everyUser: getAllUsers()) {
            System.out.println(everyUser.getName()+" "+everyUser.getPassword());
            if (everyUser.getName().equalsIgnoreCase(user.getName()) && everyUser.getPassword().equals(user.getPassword())) {
                userExist = true;
            }
        }
        return userExist;
    }

    @Override
    public User findUser(User newUser) {
        Session session = entityManager.unwrap(Session.class);
        for(User user:getAllUsers())
        {
            if(user.getName()!=null && user.getName().equalsIgnoreCase(newUser.getName()))
            {
                return user;
            }
        }
        return null;
    }

    @Override
    public User saveUser(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.save(user);
        return user;
    }
}

