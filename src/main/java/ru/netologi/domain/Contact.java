package ru.netologi.domain;

public class Contact {
    private int id;
    private String urlContact;
    private String urlPhoto;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrlContact() {
        return urlContact;
    }

    public void setUrlContact(String urlContact) {
        this.urlContact = urlContact;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
