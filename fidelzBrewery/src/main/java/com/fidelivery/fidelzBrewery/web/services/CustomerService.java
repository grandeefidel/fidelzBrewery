package com.fidelivery.fidelzBrewery.web.services;

import com.fidelivery.fidelzBrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteBeerById(UUID customerId);

}
