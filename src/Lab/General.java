package Lab;

public class General extends Usuario {

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
    
    public General() {
    }

    public General(String username, String password) {
        super(username, password);
    }

    @Override
    public String toString() {
        return username;
    }
    
}
