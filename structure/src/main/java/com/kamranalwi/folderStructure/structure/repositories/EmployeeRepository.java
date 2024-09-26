package com.kamranalwi.folderStructure.structure.repositories;

import com.kamranalwi.folderStructure.structure.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
