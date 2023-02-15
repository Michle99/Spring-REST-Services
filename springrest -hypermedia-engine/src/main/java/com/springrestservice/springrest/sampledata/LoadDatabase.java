package com.springrestservice.springrest.sampledata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.springrestservice.springrest.Beans.Employee;
import com.springrestservice.springrest.Beans.Order;
import com.springrestservice.springrest.Beans.Status;
import com.springrestservice.springrest.repos.EmployeeRepository;
import com.springrestservice.springrest.repos.OrderRepository;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {

        return args -> {
                employeeRepository.save(new Employee("James", "Bark", "Driver"));
                employeeRepository.save(new Employee("Frodo", "Baggins", "thief"));
                employeeRepository.save(new Employee("Marshall", "Gives", "Ethical Hacker"));

                employeeRepository.findAll().forEach(employee -> log.info("Preloaded " + employee));

      
                orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
                orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

                orderRepository.findAll().forEach(order -> {
                    log.info("Preloaded " + order);
                });
        };
  }
}
