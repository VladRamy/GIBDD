package com.example.onemore.Services;


import com.example.onemore.Repositories.MaintenanceRepository;
import com.example.onemore.models.Maintenance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MaintenanceService {
    private final MaintenanceRepository maintenanceRepository;

    @Autowired
    public MaintenanceService(MaintenanceRepository maintenanceRepository) {
        this.maintenanceRepository = maintenanceRepository;
    }

    public List<Maintenance> getAllMaintenance() {
        List<Maintenance> maintenance = new ArrayList<>();
        maintenanceRepository.findAll().forEach(maintenance::add);
        return maintenance;
    }

    public Maintenance getMaintenance(Integer id) {
        return maintenanceRepository.findById(id).orElse(null);
    }

    public void addMaintenance(Maintenance maintenance) {
        maintenanceRepository.save(maintenance);
    }

    public void updateMaintenance(Maintenance maintenance) {
        maintenanceRepository.save(maintenance);
    }

    public void deleteMaintenance(Integer id) {
        maintenanceRepository.deleteById(id);
    }
}
