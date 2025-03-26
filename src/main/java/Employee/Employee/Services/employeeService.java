package Employee.Employee.Services;

import Employee.Employee.DTO.EmployeeDTO;
import Employee.Employee.Entity.Employee;
import Employee.Employee.Repository.employeeRepository;
import Employee.Employee.mapper.employeeMapper;

import java.util.List;
import java.util.stream.Collectors;


public class employeeService implements employeInterface {
private employeeRepository  employeeRepository;
    @Override
    public EmployeeDTO CreateEmployee(EmployeeDTO employeeDTO) {
     Employee employee=employeeMapper.mapToEmployee(employeeDTO);
        Employee newemploy=employeeRepository.save(employee);
        return employeeMapper.maptoEmployeeDTO(newemploy);
    }

    @Override
    public void DeleteEmployee(Long id) {
        Employee employee=employeeRepository.findById(id).orElseThrow();
         employeeRepository.delete(employee);

    }

    @Override
    public EmployeeDTO updateEmployee(Long id, EmployeeDTO updateemployeeDTO) {
        Employee employee=employeeRepository.findById(id).orElseThrow();
        employee.setEmail(updateemployeeDTO.getEmail());
        employee.setFirstName(updateemployeeDTO.getFirstName());
        employee.setLastName(updateemployeeDTO.getLastName());

        return employeeMapper.maptoEmployeeDTO(employee);
    }

    @Override
    public List<EmployeeDTO> getEmployeeById() {
        List<Employee>employees=employeeRepository.findAll();

        return employees.stream().map((employee)->employeeMapper.maptoEmployeeDTO(employee))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDTO getEmployeeById(Long id) {
        Employee employee=employeeRepository.findById(id).orElseThrow();
        return employeeMapper.maptoEmployeeDTO(employee);
    }
}
