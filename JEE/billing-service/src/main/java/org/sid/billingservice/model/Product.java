package org.sid.billingservice.model;

import lombok.Data;

@Data
public class Product {
    private long id;
    private String name;
    private double price;
    private double quantity;
}
