package com.example.onemore.Services;


import com.example.onemore.Repositories.TransportVehicleRepository;
import com.example.onemore.models.TransportVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransportVehicleService {
    private final TransportVehicleRepository transportVehicleRepository;

    @Autowired
    public TransportVehicleService(TransportVehicleRepository transportVehicleRepository) {
        this.transportVehicleRepository = transportVehicleRepository;
    }

    public List<TransportVehicle> getAllTransportVehicle() {
        List<TransportVehicle> transportVehicles = new ArrayList<>();
        transportVehicleRepository.findAll().forEach(transportVehicles::add);
        return transportVehicles;
    }

    public TransportVehicle getTransportVehicle(Integer id) {
        return transportVehicleRepository.findById(id).orElse(null);
    }

    public void addTransportVehicle(TransportVehicle transportVehicle) {
        transportVehicleRepository.save(transportVehicle);
    }

    public void updateTransportVehicle(TransportVehicle transportVehicle) {
        transportVehicleRepository.save(transportVehicle);
    }

    public void deleteTransportVehicle(Integer id) {
        transportVehicleRepository.deleteById(id);
    }
}
