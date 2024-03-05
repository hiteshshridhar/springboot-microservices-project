package org.code.chronicles.departmentservices.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "departments")
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dept_name")
    private String deptName;
    @Column(name = "dept_description")
    private String deptDescription;
    @Column(name = "dept_code")
    private String deptCode;

    @Override
    public String toString() {
        return "DepartmentEntity{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                ", deptDescription='" + deptDescription + '\'' +
                ", deptCode='" + deptCode + '\'' +
                '}';
    }
}
