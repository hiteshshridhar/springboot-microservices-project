package org.code.chronicles.departmentservices.mapper;

import org.code.chronicles.departmentservices.dto.DepartmentDTO;
import org.code.chronicles.departmentservices.entity.DepartmentEntity;

public class DepartmentMapper {
    public static DepartmentDTO mapToDTO(DepartmentEntity entity) {
         return new DepartmentDTO(entity.getId(),
                 entity.getDeptName(),
                 entity.getDeptDescription(),
                 entity.getDeptCode());
    }

    public static DepartmentEntity mapToEntity(DepartmentDTO dto){
        return new DepartmentEntity(dto.getId(),
                dto.getDeptName(),
                dto.getDeptDescription(),
                dto.getDeptCode());
    }
}
