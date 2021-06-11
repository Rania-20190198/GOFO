package src.Users;
import src.System.Playgroud;
public class Administrator {
    protected String username;
    protected String password;

    public Administrator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Administrator() {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public void activePlayground(Playgroud playgroud)
    {
        playgroud.setActivated(true);
    }

    @Override
    public String toString() {
        return "Administrator{" + "username=" + username + ", password=" + password + '}';
    }
}

