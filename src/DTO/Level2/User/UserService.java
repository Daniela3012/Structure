package DTO.Level2.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    UserRespository userRepo = new UserRespository();

    public List<UserDTO> getAll () {
        List<User> users = userRepo.findAll();
        List<UserDTO> result = new ArrayList<>();

        for (User u : users) {
            result.add(new UserDTO(u.getName(),u.getEmail(),u.getRole()));
        }

        return result;
    }
}
