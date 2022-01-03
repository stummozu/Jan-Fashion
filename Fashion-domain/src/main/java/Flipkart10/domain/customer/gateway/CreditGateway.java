package Flipkart10.domain.customer.gateway;

import Flipkart10.domain.customer.Customer;
import Flipkart10.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
