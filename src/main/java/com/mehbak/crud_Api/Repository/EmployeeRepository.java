package com.mehbak.crud_Api.Repository;

import com.mehbak.crud_Api.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
