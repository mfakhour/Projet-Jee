package org.sid.billingservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.sid.billingservice.model.Customer;

import java.util.Collection;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date billingDate;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems;
    private long customerID;
    @Transient
    private Customer customer;


}
