package org.code.chronicles.departmentservices.repository;

import org.code.chronicles.departmentservices.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
    DepartmentEntity findByDeptCode(String deptCode) ;
}
