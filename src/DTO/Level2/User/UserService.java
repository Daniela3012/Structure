package DTO.Level2.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private UserRespository userRepo = new UserRespository();

    public List<UserDTO> getAll () {
        List<User> users = userRepo.findAll();
        List<UserDTO> result = new ArrayList<>();
        UserMapper mapper = new UserMapper();

        for (User u : users) {
            result.add(mapper.toDTO(u));
        }

        return result;
    }
}
