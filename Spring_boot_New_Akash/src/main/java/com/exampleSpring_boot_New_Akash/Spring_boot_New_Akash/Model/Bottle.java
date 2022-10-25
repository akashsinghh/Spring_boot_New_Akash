package com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bottle {
    String brandname;
    @Id
    @GeneratedValue
    String type;
    int price;

    public Bottle() {
    }

    public Bottle(String brandname, String type, int price) {
        this.brandname = brandname;
        this.type = type;
        this.price = price;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
