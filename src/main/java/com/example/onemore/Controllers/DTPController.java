package com.example.onemore.Controllers;


import com.example.onemore.Repositories.DTPRepository;
import com.example.onemore.Services.DTPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.onemore.models.DTP;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@RestController
public class DTPController {
    private final DTPRepository dtpRepository;
    private final DTPService dtpService;

    @Autowired
    public DTPController(DTPService dtpService, DTPRepository dtpRepository) {
        this.dtpService = dtpService;
        this.dtpRepository = dtpRepository;
    }


    @GetMapping("/getAllDTP")
    public List<DTP> getAllDTP() {
        return dtpService.getAllDTP();
    }

    @GetMapping("/{id}DTP")
    public DTP getDTP(@PathVariable Integer id) {
        return dtpService.getDTP(id);
    }

    @PostMapping("DTP")
    public void createDTP(@RequestBody DTP dtp) {
        dtpService.updateDTP(dtp);
    }

    @PutMapping("DTP")
    public void updateDTP(@RequestBody DTP dtp) {
        dtpService.updateDTP(dtp);
    }

    @DeleteMapping("/{id}DTP")
    public void deleteDTP(@PathVariable Integer id) {
        dtpService.deleteDTP(id);
    }

    @GetMapping("/dtp")
    public ModelAndView getAlldtp() {
        return new ModelAndView("dtp_list").addObject("dtp", dtpService.getAllDTP());
    }

}


