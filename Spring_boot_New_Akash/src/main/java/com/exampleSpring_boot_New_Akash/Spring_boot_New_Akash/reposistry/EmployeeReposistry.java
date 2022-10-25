package com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.reposistry;

import com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeReposistry extends JpaRepository<Employee,Long> {
}
