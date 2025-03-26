package Employee.Employee.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class EmployeeDTO {
    public Long Id;
    public String firstName;
    public String lastName;
    public String email;
}
