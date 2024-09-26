package com.kamranalwi.folderStructure.structure.controllers;

// OPERATIONS
// GET /employees
// POST /employees
// DELETE /employees/{id}

import com.kamranalwi.folderStructure.structure.dto.EmployeeDTO;
import com.kamranalwi.folderStructure.structure.services.EmployeeService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping(path = "/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return  employeeService.createNewEmployee(employeeDTO);
    }

    @DeleteMapping(path = "/{id}")
    public  boolean deleteEmployeeById(@PathVariable Long id) {
        return employeeService.deleteEmployeeById(id);
    }
}
