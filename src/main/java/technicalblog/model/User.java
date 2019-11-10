package technicalblog.model;

import org.springframework.stereotype.Repository;

@Repository
public class User {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
