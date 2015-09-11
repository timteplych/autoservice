package ru.ttv.accountentities;

/**
 * Created by user1 on 03.07.2015.
 */
public class User {
    private int id;
    private String username;
    private int userprivilege;
    private String userPassword;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserprivilege() {
        return userprivilege;
    }

    public void setUserprivilege(int userprivilege) {
        this.userprivilege = userprivilege;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
