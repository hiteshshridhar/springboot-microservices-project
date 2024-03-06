package org.code.chronicles.departmentservices.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "departments")
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String deptName;
    private String deptDescription;
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
