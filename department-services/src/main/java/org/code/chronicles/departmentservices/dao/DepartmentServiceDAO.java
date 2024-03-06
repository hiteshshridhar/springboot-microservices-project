package org.code.chronicles.departmentservices.dao;

import org.code.chronicles.departmentservices.dto.DepartmentDTO;

import java.util.List;

public interface DepartmentServiceDAO {
    List<DepartmentDTO> getAllDepartment();
     DepartmentDTO findByDeptCode(String deptCode);
     DepartmentDTO saveDepartment(DepartmentDTO departmentDTO);
     void deleteDepartment(Long id);
}
