package org.code.chronicles.departmentservices.dto;

import lombok.*;


@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {
    private Long id;
    private String deptName;
    private String deptDescription;
    private String deptCode;
}
