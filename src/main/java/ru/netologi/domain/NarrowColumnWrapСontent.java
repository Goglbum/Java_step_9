package ru.netologi.domain;

public class NarrowColumnWrapСontent {
    private int id;
    private ArticlesInfo articlesInfo;
    private PublicLink publicLink;
    private PhotoAlbum photoAlbum;
    private PublicVideo publicVideo;
    private PublickContact publickContact;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArticlesInfo getArticlesInfo() {
        return articlesInfo;
    }

    public void setArticlesInfo(ArticlesInfo articlesInfo) {
        this.articlesInfo = articlesInfo;
    }

    public PublicLink getPublicLink() {
        return publicLink;
    }

    public void setPublicLink(PublicLink publicLink) {
        this.publicLink = publicLink;
    }

    public PhotoAlbum getPhotoAlbum() {
        return photoAlbum;
    }

    public void setPhotoAlbum(PhotoAlbum photoAlbum) {
        this.photoAlbum = photoAlbum;
    }

    public PublicVideo getPublicVideo() {
        return publicVideo;
    }

    public void setPublicVideo(PublicVideo publicVideo) {
        this.publicVideo = publicVideo;
    }

    public PublickContact getPublickContact() {
        return publickContact;
    }

    public void setPublickContact(PublickContact publickContact) {
        this.publickContact = publickContact;
    }

}
