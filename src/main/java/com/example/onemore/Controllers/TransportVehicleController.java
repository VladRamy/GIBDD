package com.example.onemore.Controllers;


import com.example.onemore.Repositories.TransportVehicleRepository;
import com.example.onemore.Services.TransportVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.onemore.models.TransportVehicle;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@RestController
public class TransportVehicleController {
    private final TransportVehicleRepository transportVehicleRepository;
    private final TransportVehicleService transportVehicleService;

    @Autowired
    public TransportVehicleController(TransportVehicleService transportVehicleService, TransportVehicleRepository transportVehicleRepository) {
        this.transportVehicleService = transportVehicleService;
        this.transportVehicleRepository = transportVehicleRepository;
    }

//    @GetMapping("/please")
//    public String hello(){return "hello world";}

    @GetMapping("/getAllTV")
    public List<TransportVehicle> getAllTransportVehicle() {
        return transportVehicleService.getAllTransportVehicle();
    }

    @GetMapping("/{id}TV")
    public TransportVehicle getTransportVehicle(@PathVariable Integer id) {
        return transportVehicleService.getTransportVehicle(id);
    }

    @PostMapping("tv")
    public void createTransportVehicle(@RequestBody TransportVehicle transportVehicle) {
        transportVehicleService.updateTransportVehicle(transportVehicle);
    }

    @PutMapping("tv")
    public void updateTransportVehicle(@RequestBody TransportVehicle transportVehicle) {
        transportVehicleService.updateTransportVehicle(transportVehicle);
    }

    @DeleteMapping("/{id}TV")
    public void deleteTransportVehicle(@PathVariable Integer id) {
        transportVehicleService.deleteTransportVehicle(id);
    }

    @GetMapping("/transportVehicle")
    public ModelAndView getAllTV() {
        return new ModelAndView("transportVehicle_list").addObject("tv", transportVehicleService.getAllTransportVehicle());
    }
}


