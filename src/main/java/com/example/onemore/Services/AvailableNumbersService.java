package com.example.onemore.Services;


import com.example.onemore.Repositories.AvailableNumbersRepository;
import com.example.onemore.models.AvailableNumbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AvailableNumbersService {
    private final AvailableNumbersRepository availableNumbersRepository;

    @Autowired
    public AvailableNumbersService(AvailableNumbersRepository availableNumbersRepository) {
        this.availableNumbersRepository = availableNumbersRepository;
    }

    public List<AvailableNumbers> getAllAvailableNumbers() {
        List<AvailableNumbers> availableNumbers = new ArrayList<>();
        availableNumbersRepository.findAll().forEach(availableNumbers::add);
        return availableNumbers;
    }

    public AvailableNumbers getAvailableNumbers(Integer id) {
        return availableNumbersRepository.findById(id).orElse(null);
    }

    public void addAvailableNumbers(AvailableNumbers availableNumbers) {
        availableNumbersRepository.save(availableNumbers);
    }

    public void updateAvailableNumbers(AvailableNumbers availableNumbers) {
        availableNumbersRepository.save(availableNumbers);
    }

    public void deleteAvailableNumbers(Integer id) {
        availableNumbersRepository.deleteById(id);
    }
}
