package Employee.Employee.mapper;

import Employee.Employee.DTO.EmployeeDTO;
import Employee.Employee.Entity.Employee;

public class employeeMapper {

    public static EmployeeDTO maptoEmployeeDTO(Employee employee){

        return new EmployeeDTO(
                employee.getId(),
                employee.getEmail(),
                employee.getLastName(),
                employee.getFirstName()

        );
    }

    public static Employee mapToEmployee(EmployeeDTO employeeDTO){

        return new Employee(
                employeeDTO.getId(),
                employeeDTO.getFirstName(),
                employeeDTO.getLastName(),
                employeeDTO.getEmail()
        );
    }
}
