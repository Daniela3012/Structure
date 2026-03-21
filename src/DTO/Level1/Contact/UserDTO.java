package DTO.Level1.Contact;

public class UserDTO {
    private String fullName;
    private String email;

    public UserDTO(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
}
