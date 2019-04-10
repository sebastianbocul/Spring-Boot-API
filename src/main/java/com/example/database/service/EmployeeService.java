package com.example.database.service;

import com.example.database.entity.Employee;

import java.util.List;

public interface EmployeeService {

        public List<Employee> findAll();

        public  Employee findById(int theId);

        public void save(Employee theEmplyee);

        public void deleteById(int theId);
}
