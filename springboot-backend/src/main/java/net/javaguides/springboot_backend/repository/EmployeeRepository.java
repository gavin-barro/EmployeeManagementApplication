package net.javaguides.springboot_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.javaguides.springboot_backend.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
