package org.code.chronicles.departmentservices.repository;

import org.code.chronicles.departmentservices.entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Long> {
}
