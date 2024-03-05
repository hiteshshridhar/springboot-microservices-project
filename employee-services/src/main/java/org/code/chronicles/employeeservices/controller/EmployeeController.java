package org.code.chronicles.employeeservices.controller;

import org.code.chronicles.employeeservices.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    private EmployeeDTO employeeDTO;

    public EmployeeController(EmployeeDTO employeeDTO) {
        this.employeeDTO = employeeDTO;
    }

    public void getAllEmployees(){}

    public void getAllEmployeeById(int id){}

    public void createEmployee(RequestBody body){}

    public void updateEmployee(int id, RequestBody body){}

    public void deleteEmployee(int id){}
}
