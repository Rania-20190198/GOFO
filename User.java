package src.Users;
import src.System.Address;
import src.System.eWallet;
public class User {
    protected String fName,lName;
    protected String email,password;
    protected String username;
    protected Address address;
    protected String phone;
    protected eWallet ewallet;
     
   public User(){
   }

    public User(String fName, String lName, String email, String password, String username, String phone,Address address) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;
        this.username = username;
        this.phone = phone;
        this.address=address;
        ewallet = new eWallet();
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
    
    public eWallet geteWallet(){
    return ewallet;
    }
    
    public void checkEwallet() {
        System.out.println("Your Balance is= " + ewallet.getBalance());
    }   

    @Override
    public String toString() {
        return "User{" + "fName=" + fName + ", lName=" + lName + ", email=" + email + ", password=" + password + ", username=" + username + ", address=" + address + ", phone=" + phone +  '}';
    }
}
