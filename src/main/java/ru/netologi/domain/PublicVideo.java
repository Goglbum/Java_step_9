package ru.netologi.domain;

public class PublicVideo {
    private int id;
    private int quantityVideo;
    private String urlVideo;
    private String nameVideo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantityVideo() {
        return quantityVideo;
    }

    public void setQuantityVideo(int quantityVideo) {
        this.quantityVideo = quantityVideo;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public String getNameVideo() {
        return nameVideo;
    }

    public void setNameVideo(String nameVideo) {
        this.nameVideo = nameVideo;
    }
}
