package Flipkart10.domain.customer.gateway;

import Flipkart10.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
