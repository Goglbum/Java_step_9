package ru.netologi.domain;

public class Album {
    private int id;
    private int quantityPhoto;
    private String urlPhoto;
    private String namePhoto;
    private String nameAlbum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantityPhoto() {
        return quantityPhoto;
    }

    public void setQuantityPhoto(int quantityPhoto) {
        this.quantityPhoto = quantityPhoto;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public String getNamePhoto() {
        return namePhoto;
    }

    public void setNamePhoto(String namePhoto) {
        this.namePhoto = namePhoto;
    }

    public String getNameAlbum() {
        return nameAlbum;
    }

    public void setNameAlbum(String nameAlbum) {
        this.nameAlbum = nameAlbum;
    }
}
