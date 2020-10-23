package ru.netologi.domain;

public class PublicLink {
    private int id;
    private int quantityLinks;
    private Link link;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantityLinks() {
        return quantityLinks;
    }

    public void setQuantityLinks(int quantityLinks) {
        this.quantityLinks = quantityLinks;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }
}
