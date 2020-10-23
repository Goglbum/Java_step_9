package ru.netologi.domain;

public class NarrowColumnWrapSubscribers {
    private int id;
    private int quantitiSubscribers;
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantitiSubscribers() {
        return quantitiSubscribers;
    }

    public void setQuantitiSubscribers(int quantitiSubscribers) {
        this.quantitiSubscribers = quantitiSubscribers;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
