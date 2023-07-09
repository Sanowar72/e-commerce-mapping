package com.EcommerceApi.EcommerceApi.Repository;

import com.EcommerceApi.EcommerceApi.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address,Long> {
}
