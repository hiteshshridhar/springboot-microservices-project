package org.code.chronicles.employeeservices.repository;

import org.code.chronicles.employeeservices.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
