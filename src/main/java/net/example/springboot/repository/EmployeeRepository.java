package net.example.springboot.repository;

import net.example.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  @param ==> Employee from the model/Entity is the first parameter
 *  @param ==> Long is second Parameter representing the private id field
 *  from Employee class
 **/

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
