package com.example.database.dao;

import com.example.database.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

   public List<Employee> findAll();

   public Employee findById(int theId);

   public void save(Employee theEmployee);

   public void deleteById(int theId);

}
