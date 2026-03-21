package DTO.Level1.Contact;
public class UserMapper {

    public UserMapper() {
    }

    public UserDTO toDTO (User user) {
        if (user == null) return null;
        return new UserDTO(getFullName(user.getFirstName(), user.getLastName()),user.getEmail());
    }

    private String getFullName (String firstName, String lastName) {
        if (firstName == null || lastName == null) return "Sin nombre";
        return firstName+" "+lastName;
    }
}
