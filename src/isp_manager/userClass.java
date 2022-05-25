package isp_manager;

public class userClass {

    private String name;
    private String username;
    private String userID;
    private String password;
    private String userType;
    private String emailAddress;
    private String phoneNo;
    private String legalDocNum;

    public void setName(String name)    {
        this.name = name;
    }

    public void setUserName(String username)    {
        this.username = username;
    }

    public void setID(String id)    {
        this.userID = id;
    }

    public void setPassword(String password)    {
        this.password = password;
    }

    public void setUserType(String userType)    {
        this.userType = userType;
    }

    public void setEmail(String emailAddress)    {
        this.emailAddress = emailAddress;
    }

    public void setPhone(String phoneNo)    {
        this.phoneNo = phoneNo;
    }

    public void setDoc (String legalDocNum)  {
        this.legalDocNum = legalDocNum;
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

    public String getEmail() {
        return emailAddress;
    }

    public String getUserPhone() {
        return phoneNo;
    }

    public String getDoc() {
        return legalDocNum;
    }
    
}
