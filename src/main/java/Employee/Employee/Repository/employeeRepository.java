package Employee.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Employee.Employee.Entity.Employee;

public interface employeeRepository extends JpaRepository<Employee,Long> {
}
