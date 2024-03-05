package org.code.chronicles.employeeservices.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class EmployeeDTO {
    private Long id;
    private String empFirstName;
    private String empLastName;
    private String empEmail;
    private String deptCode;
    private String orgCode;
}
