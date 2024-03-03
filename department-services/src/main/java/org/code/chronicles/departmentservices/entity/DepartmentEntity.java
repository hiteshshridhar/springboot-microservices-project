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
    @Column
    private Long id;

    @Column
    private String deptName;
    @Column
    private String deptDescription;
    @Column
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
