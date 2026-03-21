package DTO.Level2.User;

public class UserDTO {
    private String name;
    private String email;
    private String rolName;

    public UserDTO(String name, String email, String rolName) {
        this.name = name;
        this.email = email;
        this.rolName = rolName;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getRolName() {
        return rolName;
    }
}
