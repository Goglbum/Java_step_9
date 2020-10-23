package ru.netologi.domain;

public class PageCover {
    private int id;
    private String urlPageCoverPhoto;
    private String urlPageCoverInfoPhoto;
    private String info;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrlPageCoverPhoto() {
        return urlPageCoverPhoto;
    }

    public void setUrlPageCoverPhoto(String urlPageCoverPhoto) {
        this.urlPageCoverPhoto = urlPageCoverPhoto;
    }

    public String getUrlPageCoverInfoPhoto() {
        return urlPageCoverInfoPhoto;
    }

    public void setUrlPageCoverInfoPhoto(String urlPageCoverInfoPhoto) {
        this.urlPageCoverInfoPhoto = urlPageCoverInfoPhoto;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
