package com.EcommerceApi.EcommerceApi.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String landMark;
    private String phoneNumber;
    private String zipCode;
    private String state;
    @OneToOne
    @JoinColumn(name = "fk_user-id")
    private User user;
}
