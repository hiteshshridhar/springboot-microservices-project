package org.code.chronicles.employeeservices.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "emp_first_name")
    private String empFirstName;
    @Column(name = "emp_last_name")
    private String empLastName;
    @Column(name = "emp_email", nullable = false,unique = true)
    private String empEmail;
    @Column(name = "dept_code")
    private String deptCode;
    @Column(name = "org_code")
    private String orgCode;

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", empFirstName='" + empFirstName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", orgCode='" + orgCode + '\'' +
                '}';
    }
}
