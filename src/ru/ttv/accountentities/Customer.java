package ru.ttv.accountentities;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by user1 on 03.07.2015.
 */
public class Customer {
    private int id;
    private String name;
    private Date creationDate;
    private String bank;
    private int author;
    private String adress;
    private String phones;
    private String fullName;
    private String othercontacts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getOthercontacts() {
        return othercontacts;
    }

    public void setOthercontacts(String othercontacts) {
        this.othercontacts = othercontacts;
    }
}
