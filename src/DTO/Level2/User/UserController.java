package DTO.Level2.User;

import java.util.List;

public class UserController {
    private UserService service = new UserService();

    public List<UserDTO> getUsers () {
        return service.getAll();
    }
}
