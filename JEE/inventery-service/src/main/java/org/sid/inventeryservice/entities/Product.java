package org.sid.inventeryservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String name;
    private double price;
    private double quantity;
}
