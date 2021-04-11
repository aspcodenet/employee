package com.example.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
	private EmployeeRepository employeeRepository;

    List<Employee> getAll(){
        var l = new ArrayList<Employee>();
        for(Employee r : employeeRepository.findAll())
        {
            l.add(r);
        }
        return l;
    }

    Employee get(Integer id){
        return employeeRepository.findById(id).get();
    }

    
    
}
