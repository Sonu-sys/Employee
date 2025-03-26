package Employee.Employee.Services;

import Employee.Employee.DTO.EmployeeDTO;
import jakarta.persistence.Id;

import java.util.List;

public interface employeInterface {
    EmployeeDTO CreateEmployee(EmployeeDTO employeeDTO);
    void DeleteEmployee(Long id);
    EmployeeDTO updateEmployee(Long id,EmployeeDTO updateemployeeDTO);
    List<EmployeeDTO> getEmployeeById();

    EmployeeDTO getEmployeeById(Long id);
}
