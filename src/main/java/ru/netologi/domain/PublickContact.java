package ru.netologi.domain;

public class PublickContact {
    private int id;
    private int quantityContact;
    private Contact contact;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantityContact() {
        return quantityContact;
    }

    public void setQuantityContact(int quantityContact) {
        this.quantityContact = quantityContact;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
