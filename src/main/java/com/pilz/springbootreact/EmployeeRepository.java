package com.pilz.springbootreact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

@org.springframework.stereotype.Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
}
