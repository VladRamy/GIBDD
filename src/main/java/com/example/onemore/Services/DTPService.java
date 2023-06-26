package com.example.onemore.Services;


import com.example.onemore.Repositories.DTPRepository;
import com.example.onemore.models.DTP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DTPService {

    private final DTPRepository dtpRepository;

    @Autowired
    public DTPService(DTPRepository dtpRepository) {
        this.dtpRepository = dtpRepository;
    }


    public List<DTP> getAllDTP() {
        List<DTP> dtp = new ArrayList<>();
        dtpRepository.findAll().forEach(dtp::add);
        return dtp;
    }

    public DTP getDTP(Integer id) {
        return dtpRepository.findById(id).orElse(null);
    }

    public void addDTP(DTP dtp) {
        dtpRepository.save(dtp);
    }

    public void updateDTP(DTP dtp) {
        dtpRepository.save(dtp);
    }

    public void deleteDTP(Integer id) {
        dtpRepository.deleteById(id);
    }
}
