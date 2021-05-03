/*
*
*  @Author Eyad Mostafa
*
*/

public class User{
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    public User(String username, String password, String fname, String lname) {
        this.username = username;
        this.password = password;
        firstName = fname;
        lastName = lname;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setFirstName(String fname) {
        firstName = fname;
    }
    public void setLastName(String lname) {
        lastName = lname;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}
