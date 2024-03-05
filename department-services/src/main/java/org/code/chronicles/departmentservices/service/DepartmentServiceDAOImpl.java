package org.code.chronicles.departmentservices.service;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.code.chronicles.departmentservices.dao.DepartmentServiceDAO;
import org.code.chronicles.departmentservices.dto.DepartmentDTO;
import org.code.chronicles.departmentservices.entity.DepartmentEntity;
import org.code.chronicles.departmentservices.mapper.DepartmentMapper;
import org.code.chronicles.departmentservices.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentServiceDAOImpl implements DepartmentServiceDAO {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<DepartmentDTO> getAllDepartment() {
       List<DepartmentEntity> getAllDepartments = departmentRepository.findAll();
        return getAllDepartments.stream().map(DepartmentMapper::mapToDTO).toList();
    }

    @Override
    public DepartmentDTO getDepartmentId(int id) {
        return null;
    }

    @Override
    public DepartmentDTO saveDepartment(DepartmentDTO departmentDTO) {
    //convert deptDTO to DeptJPAEntity -> using mapper class
        DepartmentEntity departmentEntity = DepartmentMapper.mapToEntity(departmentDTO);
        DepartmentEntity savedDepartmentEntity = departmentRepository.save(departmentEntity);
        return DepartmentMapper.mapToDTO(savedDepartmentEntity);
    }

    @Override
    public void deleteDepartment(Long id) {
        departmentRepository.deleteById(id);
    }
}
