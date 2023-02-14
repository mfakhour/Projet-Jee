package org.sid.customerservice;

import org.sid.customerservice.entitiers.Customer;
import org.sid.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}


	@Bean
	CommandLineRunner strat(CustomerRepository customerRepository, RepositoryRestConfiguration restConfiguration){
		restConfiguration.exposeIdsFor(Customer.class);
		return arg -> {
			customerRepository.save(new Customer(1,"youness","yns@gmail.com"));
			customerRepository.save(new Customer(2,"youness2","yns2@gmail.com"));
			customerRepository.save(new Customer(3,"youness3","yns3@gmail.com"));
			customerRepository.findAll().forEach(c->{
				System.out.println(c.toString());
			});
		};
	}
}
