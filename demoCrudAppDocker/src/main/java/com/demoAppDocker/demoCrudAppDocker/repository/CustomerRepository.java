package com.demoAppDocker.demoCrudAppDocker.repository;

import com.demoAppDocker.demoCrudAppDocker.domain.Customer;

public interface CustomerRepository extends MongoRepository<Customer,String> {
}
