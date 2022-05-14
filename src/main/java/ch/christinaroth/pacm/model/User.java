package ch.christinaroth.pacm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    private @Id String username;
    private String email;
    private String password;
    private String birthday;
    private boolean loggedIn;

    public User() {
        this.username = "";
        this.email = "";
        this.password = "";
        this.birthday = "";
        loggedIn = false;
    }

    public User(String username, String email, String password, String birthday) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.birthday = birthday;
        loggedIn = false;
    }

    public void logOut() {
        loggedIn = false;
    }

    public void logIn() {
        loggedIn = true;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}