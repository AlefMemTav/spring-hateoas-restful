package estudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import estudo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
