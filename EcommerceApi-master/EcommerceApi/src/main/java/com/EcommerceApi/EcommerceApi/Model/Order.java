package com.EcommerceApi.EcommerceApi.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "fk_user_id")
    private User user;

    @OneToMany
    @JoinColumn(name = "fk_order_id")
    private List<Product> productList;
    @OneToOne
    @JoinColumn(name = "fk_address_id")
    private Address address;

    private Integer productQuantity;


}
