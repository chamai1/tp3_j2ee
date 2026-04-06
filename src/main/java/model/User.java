package model;

// Classe simple pour représenter un utilisateur
public class User {
    private String email;
    private String password;

    // Constructeur
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getter pour email
    public String getEmail() {
        return email;
    }

    // Getter pour password
    public String getPassword() {
        return password;
    }
}