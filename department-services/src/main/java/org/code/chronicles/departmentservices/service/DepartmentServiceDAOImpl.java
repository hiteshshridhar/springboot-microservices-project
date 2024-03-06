package org.code.chronicles.departmentservices.service;

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
@NoArgsConstructor
public class DepartmentServiceDAOImpl implements DepartmentServiceDAO {

    private DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceDAOImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<DepartmentDTO> getAllDepartment() {
       List<DepartmentEntity> getAllDepartments = departmentRepository.findAll();
        return getAllDepartments.stream().map(DepartmentMapper::mapToDTO).toList();
    }

    @Override
    public DepartmentDTO findByDeptCode(String deptCode) {
        DepartmentEntity entity = departmentRepository.findByDeptCode(deptCode);
        System.out.println("Entity value came out to be: "+entity);
        return new DepartmentDTO(
                entity.getId(),
                entity.getDeptName(),
                entity.getDeptDescription(),
                entity.getDeptCode()
        );
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
