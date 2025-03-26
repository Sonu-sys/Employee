package Employee.Employee.Controller;

import Employee.Employee.DTO.EmployeeDTO;
import Employee.Employee.Entity.Employee;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Employee.Employee.Services.employeeService;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employee")

public class controller {

    private employeeService employeeService;
     public ResponseEntity<EmployeeDTO> getemployeeById(@PathVariable("id") Long Id)

     {
         EmployeeDTO employeeDTO=employeeService.getEmployeeById(Id);
         return ResponseEntity.ok(employeeDTO);


     }
     public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable("id") Long id, @RequestBody EmployeeDTO employee)

     {
         EmployeeDTO employeeDTO=employeeService.updateEmployee(id,employee);
         return ResponseEntity.ok(employeeDTO);
     }
}
