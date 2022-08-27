package com.example.homework210.controller;

import com.example.homework210.employee.Employee;
import com.example.homework210.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
        private final EmployeeService employeeService;

        public EmployeeController(EmployeeService employeeService) {
            this.employeeService = employeeService;
        }

    @GetMapping("/add")
    public Employee add(@RequestParam("firstname") String name,
                        @RequestParam("lastname") String surname,
                        @RequestParam("departmentId") int department,
                        @RequestParam double salary) {
        return employeeService.addEmployee(name, surname, department, salary);
    }
        @GetMapping("/remove")
        public Employee remove(@RequestParam("firstname") String name,
                               @RequestParam("lastname") String surname) {
            return employeeService.removeEmployee(name, surname);
        }
        @GetMapping("/find")
        public Employee find(@RequestParam("firstname") String name,
                             @RequestParam("lastname") String surname) {
            return employeeService.findEmployee(name, surname);
        }

        @GetMapping
        public List<Employee> getAll() {
            return employeeService.getAll();
        }
}
