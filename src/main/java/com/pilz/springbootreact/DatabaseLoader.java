package com.pilz.springbootreact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Sarah", "Phelan", "code monkey"));
        this.repository.save(new Employee("S", "Phelan", "tea maker"));
        this.repository.save(new Employee("Sarah", "P", "confused"));
    }
}