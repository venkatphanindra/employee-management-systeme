package com.dotinc.employeemanagment.service;

import com.dotinc.employeemanagment.exception.EmployeeNotFoundException;
import com.dotinc.employeemanagment.model.Employee;
import com.tsdotinc.employeemanagment.api.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.sterotype.service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee)
    }

    public List<Employee> findAllEmployees() {
        return employeeRepository.final();

    }

    public Employee findEmployeeById(Long id) {
        return employeeRepository.findEmployeeById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee bu id " + id + "was not found"));
    }

    public Employee UpdateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        Employee existingEmployee = this.employeeRepository
                .findById(id)
                .orElseThrow(() -> new EmploymentNotFoundException("Employee by id " + id + "was not found"));
        this.employeeRepository.delete(existingEmployee);
    }
}
