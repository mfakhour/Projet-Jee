package org.sid.inventeryservice;

import org.sid.inventeryservice.entities.Product;
import org.sid.inventeryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class InventeryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventeryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner strat(ProductRepository productRepository, RepositoryRestConfiguration restConfiguration){
        restConfiguration.exposeIdsFor(Product.class);
        return arg -> {
            productRepository.save(new Product(1,"Pc",999,50));
            productRepository.save(new Product(2,"Playstation",2599,25));
            productRepository.save(new Product(3,"Xbox",2999,300));
            productRepository.findAll().forEach(p->{
                System.out.println(p.getName());
            });
        };
    }
}
