package com.ace.thymleafdemo;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends ListCrudRepository<CustomerEntity, Integer> {
}

