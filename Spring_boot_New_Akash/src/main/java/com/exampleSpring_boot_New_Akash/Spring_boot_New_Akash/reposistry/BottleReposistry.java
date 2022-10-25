package com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.reposistry;

import com.exampleSpring_boot_New_Akash.Spring_boot_New_Akash.Model.Bottle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BottleReposistry extends JpaRepository<Bottle,Long>{
    public Bottle findByBrandname(String brandname);

}
