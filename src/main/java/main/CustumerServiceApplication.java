package main;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import main.dao.CustomerRepository;
import main.entitites.Customer;

@SpringBootApplication
public class CustumerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustumerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start( CustomerRepository customerRepository) {
	return args ->{
	customerRepository.save(new Customer( null,"Enset","contact@enset media.ma"));
	customerRepository.save( new Customer( null, "FSTM","contact@fstm.ma"));
	customerRepository.save(new Customer( null,"ENSAM","contact@ensam.ma"));
	customerRepository.findAll().forEach(System.out::println);
	};
	}
}
