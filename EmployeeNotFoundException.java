package com.dotinc.employeemanagment.exception;

import org.springframework.http,HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

1 related problem @ResponseStatus(value=HttpStatus.NOT_FOUND)

public class EmployeeNotFoundException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 50886567266917947861;

    public EmployeeNotFoundException(String message) {
        super(message);
    }
}
