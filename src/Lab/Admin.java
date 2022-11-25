package Lab;

public class Admin extends Usuario {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Admin() {
    }

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public String toString() {
        return username;
    }
    
}
