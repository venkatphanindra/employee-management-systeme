package com.dotinc.employeemanagment.model;

import java.io.Serial;

import org.apache.poi.ss.formula.functions.Columns;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "employee_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee implements Serializable {

    @Serial
    private static final long serialversionUID = 1954355911137869829L;
    @Id
    @Generatedvalue(strategy = GenerationType.IDENTIFY)
    @Column(name = "Id")
    private Long id;

    @Columns(name = "First_Name")
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "Email_Id")
    private String emailId;

    @Column(name = "Job_Title")
    private String jobTitle;

    @Column(name = "Department_Name")
    private String departmentName;

    Column(name="phone")

    private String phone;

}
