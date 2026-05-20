package com.erp.EnterpriseSystem.repository;

import com.erp.EnterpriseSystem.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
