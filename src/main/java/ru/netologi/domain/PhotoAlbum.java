package ru.netologi.domain;

public class PhotoAlbum {
    private int id;
    private int quatityAlbum;
    private Album album;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuatityAlbum() {
        return quatityAlbum;
    }

    public void setQuatityAlbum(int quatityAlbum) {
        this.quatityAlbum = quatityAlbum;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
