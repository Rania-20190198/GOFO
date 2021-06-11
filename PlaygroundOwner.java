package src.Users;
import java.util.ArrayList;
import src.System.Playgroud;
import src.Users.User;
import src.System.Address;
public class PlaygroundOwner extends User{
    protected ArrayList<Playgroud>playgroud;

    public PlaygroundOwner(String fName, String lName, String email, String password, String username, String phone,Address address) {
    super (fName,lName,email,password,username, phone, address);
    playgroud = new ArrayList<>();
    
}

    public PlaygroundOwner(ArrayList<Playgroud> playgroud) {
        this.playgroud = playgroud;
    }

    public PlaygroundOwner() {
       
    }
    public void addPlayground(Playgroud playground){
        playgroud.add(playground);
    
    }

    @Override
    public String toString() {
        return "PlaygroundOwner{" + "playgroud=" + playgroud + '}';
    }
    
    public ArrayList<Playgroud> getPlaygroud() {
        return playgroud;
    }
}
