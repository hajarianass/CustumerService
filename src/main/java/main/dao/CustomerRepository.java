package main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import main.entitites.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
