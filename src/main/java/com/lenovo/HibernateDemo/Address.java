package com.lenovo.HibernateDemo;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "StudentAddress")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "address_ID")
    private int addressID;
    @Column(length = 50,name ="Street")
    private String street;
    private String city;
    private boolean isOpen;

    @Transient
    private double x;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Lob
    private byte[] image;

    public Address(int addressID, String street, String city, boolean isOpen, double x, Date date, byte[] image) {
        this.addressID = addressID;
        this.street = street;
        this.city = city;
        this.isOpen = isOpen;
        this.x = x;
        this.date = date;
        this.image = image;
    }
    public Address() {

    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
