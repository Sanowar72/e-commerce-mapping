package com.EcommerceApi.EcommerceApi.Controller;

import com.EcommerceApi.EcommerceApi.Model.Address;
import com.EcommerceApi.EcommerceApi.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address address){
    return addressService.saveAddress(address);
    }

}
