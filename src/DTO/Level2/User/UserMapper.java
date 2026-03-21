package DTO.Level2.User;

public class UserMapper {

    public UserMapper() {
    }

    public UserDTO toDTO (User user) {
        if (user == null) return null;

        return new UserDTO(user.getName(), user.getEmail(), mapRoleName(user.getRole()));
    }

    private String mapRoleName (String role) {
        if (role == null) return "Desconocido";
        return switch (role) {
            case "ADMIN" -> "Administrador";
            case "USER" -> "Usuario";
            default -> "Desconocido";
        };

    }
}
