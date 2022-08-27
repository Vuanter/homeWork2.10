package com.example.homework210.service;

import com.example.homework210.employee.Employee;
import com.example.homework210.exception.InvalidNameException;
import com.example.homework210.exception.InvalidSurnameException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class ValidatorService {
    public Employee validateEmployee(String name,
                                     String surname,
                                     int department,
                                     double salary) {
        if (!StringUtils.isAlpha(name)) {
            throw new InvalidNameException();
        }
        if (!StringUtils.isAlpha(surname)) {
            throw new InvalidSurnameException();
        }
        return new Employee(
                StringUtils.capitalize(name.toLowerCase()),
                StringUtils.capitalize(surname.toLowerCase()),
                department,
                salary
        );
    }
}
