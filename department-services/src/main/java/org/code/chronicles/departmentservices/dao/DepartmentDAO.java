package org.code.chronicles.departmentservices.dao;

import org.code.chronicles.departmentservices.dto.DepartmentDTO;

import java.util.List;

public interface DepartmentDAO {
    List<DepartmentDTO> getAllEmployees();
     DepartmentDTO getEmployeebyId(int id);
     DepartmentDTO createEmployee(DepartmentDTO departmentDTO);
     DepartmentDTO deleteEmployee(int id);
}
