package org.ssoft.learning.spring.mongodb.repo;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.ssoft.learning.spring.mongodb.domain.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);

}