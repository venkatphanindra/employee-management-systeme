package com.dotinc.employeemanagment.repository;

import com.dotin.employeemanagment.modle.Employee;
import org.springframework.data.jpa.repository.jpaRepository;
import org,springframework.sterotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, long> {

    Optional<Employee> findEmployeeById(Long id);
}
