package com.example.onemore.Controllers;


import com.example.onemore.Repositories.MaintenanceRepository;
import com.example.onemore.Services.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.onemore.models.Maintenance;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@RestController
public class MaintenanceController {
    private final MaintenanceRepository maintenanceRepository;
    private final MaintenanceService maintenanceService;

    @Autowired
    public MaintenanceController(MaintenanceService maintenanceService, MaintenanceRepository maintenanceRepository) {
        this.maintenanceService = maintenanceService;
        this.maintenanceRepository = maintenanceRepository;
    }

//    @GetMapping("/please")
//    public String hello(){return "hello world";}

    @GetMapping("/getAllMain")
    public List<Maintenance> getAllMaintenance() {
        return maintenanceService.getAllMaintenance();
    }

    @GetMapping("/{id}Main")
    public Maintenance getMaintenance(@PathVariable Integer id) {
        return maintenanceService.getMaintenance(id);
    }

    @PostMapping("main")
    public void createExistingNumbers(@RequestBody Maintenance maintenance) {
        maintenanceService.updateMaintenance(maintenance);
    }

    @PutMapping("main")
    public void updateMaintenance(@RequestBody Maintenance maintenance) {
        maintenanceService.updateMaintenance(maintenance);
    }

    @DeleteMapping("/{id}Main")
    public void deleteMaintenance(@PathVariable Integer id) {
        maintenanceService.deleteMaintenance(id);
    }

    @GetMapping("/maintenance")
    public ModelAndView getAllMain() {
        return new ModelAndView("maintenance_list").addObject("maintenance", maintenanceService.getAllMaintenance());
    }

}


