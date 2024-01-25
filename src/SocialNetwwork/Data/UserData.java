package SocialNetwwork.Data;

public class UserData {
    private final String nekName;
    private final String userName;

    public UserData(String nekName, String userName) {
        this.nekName = nekName;
        this.userName = userName;
    }

    public String getNekName() {
        return nekName;
    }

    public String getUserName() {
        return userName;
    }
}
