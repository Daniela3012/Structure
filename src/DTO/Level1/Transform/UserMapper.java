package DTO.Level1.Transform;

public class UserMapper {
    private UserMapper () {}

    public UserDTO toDTO (User user) {
        if (user == null) return null;
        return new UserDTO(user.getName(), user.getEmail(),mapRole(user.getRole()));
    }

    private String mapRole (String role) {
        String transformRole;
        if (role == null) return transformRole="Desconocido";
        switch (role) {
            case "ADMIN" -> transformRole = "Administrador";
            case "USER" -> transformRole = "Usuario";
            default -> transformRole = "Desconocido";
        };
        return transformRole;
    }

}
