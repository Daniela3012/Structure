package DTO.Level1.Transform;

public class UserMapper {
    public UserMapper () {}

    public UserDTO toDTO (User user) {
        if (user == null) return null;
        return new UserDTO(user.getName(), user.getEmail(),mapRole(user.getRole()));
    }

    private String mapRole(String role) {
        if (role == null) return "Desconocido";
        return switch (role) {
            case "ADMIN" -> "Administrador";
            case "USER" -> "Usuario";
            default -> "Desconocido";
        };
    }

}
