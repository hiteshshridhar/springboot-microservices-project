package org.code.chronicles.departmentservices.controller;

import org.code.chronicles.departmentservices.dto.DepartmentDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController {
    @GetMapping("")
    public List<DepartmentDTO> getAllEmployees(){
        return null;
    }

    @GetMapping("{id}")
    public DepartmentDTO getEmployeeById(@PathVariable("id") int deptId) {
        return null;
    }

    @PostMapping()
    public ResponseEntity<DepartmentDTO> createEmployee(@RequestBody DepartmentDTO departmentDTO){
        return null;
    }

    @PutMapping("{id}")
    public ResponseEntity<DepartmentDTO> updateEmployee(@PathVariable("id") int deptId){
        return null;
    }

    @DeleteMapping("{id}")
    public void deleteEmployeeById(int deptId){

    }
}
