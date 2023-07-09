package com.EcommerceApi.EcommerceApi.Service;

import com.EcommerceApi.EcommerceApi.Model.Address;
import com.EcommerceApi.EcommerceApi.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;
    public String saveAddress(Address address) {
        if(address.getUser()==null){
            addressRepo.save(address);
            return "order is not added Yet";
        }

        addressRepo.save(address);
        return "Address Is Added";
    }
}
