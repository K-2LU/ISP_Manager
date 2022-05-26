package isp_manager;

public class User {

    private String name;
    private String username;
    private String userID;
    private String password;
    private String userType;

    public void setName(String name) {
        this.name = name;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public void setID(String id) {
        this.userID = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public String getUserType() {
        return userType;
    }
}
