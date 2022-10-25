package com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.reposistry;

import com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.Model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Doctorreposistry extends JpaRepository<Doctor ,Long > {
    public Doctor  findByName(String name);
    public Doctor  findByDept(String dept);
}
