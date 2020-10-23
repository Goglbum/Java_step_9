package ru.netologi.domain;

public class SideBar {
    private int id;
    private String email;
    private String password;
    private String quickForgot;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQuickForgot() {
        return quickForgot;
    }

    public void setQuickForgot(String quickForgot) {
        this.quickForgot = quickForgot;
    }
}
