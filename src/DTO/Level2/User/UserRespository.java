package DTO.Level2.User;

import java.util.ArrayList;
import java.util.List;

public class UserRespository {
    List<User> users = new ArrayList<>();

    public List<User> findAll () {
        users.add(new User("001", "Daniela", "dani@gmail.com", "123", "ADMIN"));
        users.add(new User("002", "Dylan", "dani@gmail.com", "123", "ADMIN"));
        users.add(new User("001", "Diego", "dani@gmail.com", "123", "ADMIN"));
        return findAll();
    }


}
