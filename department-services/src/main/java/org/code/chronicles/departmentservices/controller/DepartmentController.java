package org.code.chronicles.departmentservices.controller;

import org.code.chronicles.departmentservices.dao.DepartmentServiceDAO;
import org.code.chronicles.departmentservices.dto.DepartmentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController {

    private final DepartmentServiceDAO  departmentServiceDAO;

    @Autowired
    public DepartmentController(DepartmentServiceDAO departmentServiceDAO) {
        this.departmentServiceDAO = departmentServiceDAO;
    }

    @GetMapping("")
    public ResponseEntity<List<DepartmentDTO>> getAllDepartments(){
        List<DepartmentDTO> allDepartment = departmentServiceDAO.getAllDepartment();
        return new ResponseEntity<>(allDepartment,HttpStatus.OK) ;
    }

    @GetMapping("{dept-code}")
    public ResponseEntity<DepartmentDTO> getDepartmentByCode(@PathVariable("dept-code") String deptCode) {
        DepartmentDTO dto = departmentServiceDAO.findByDeptCode(deptCode);
        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<DepartmentDTO> createEmployee(@RequestBody DepartmentDTO departmentDTO){
        DepartmentDTO savedDepartmentDTO = departmentServiceDAO.saveDepartment(departmentDTO);
        return new ResponseEntity<>(savedDepartmentDTO,HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<DepartmentDTO> updateEmployee(@PathVariable("id") int deptId){
        return null;
    }

    @DeleteMapping("{id}")
    public void deleteEmployeeById(@PathVariable("id") Long deptId){
        departmentServiceDAO.deleteDepartment(deptId);
    }
}
