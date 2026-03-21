package DTO.Level1.Transform;

public class UserDTO {
    private String name;
    private String email;
    private String roleName;

    public UserDTO(String name, String email, String roleName) {
        this.name = name;
        this.email = email;
        this.roleName = roleName;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getRoleName() {
        return roleName;
    }
}
