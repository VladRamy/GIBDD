package com.example.onemore.Services;


import com.example.onemore.Repositories.ExistingNumbersRepository;
import com.example.onemore.models.ExistingNumbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExistingNumbersService {
    private final ExistingNumbersRepository existingNumbersRepository;

    @Autowired
    public ExistingNumbersService(ExistingNumbersRepository existingNumbersRepository) {
        this.existingNumbersRepository = existingNumbersRepository;
    }

            public List<ExistingNumbers> getAllExistingNumbers() {
        List<ExistingNumbers> existingNumbers = new ArrayList<>();
        existingNumbersRepository.findAll().forEach(existingNumbers::add);
        return existingNumbers;
    }

    public ExistingNumbers getExistingNumbers(Integer id) {
        return existingNumbersRepository.findById(id).orElse(null);
    }

    public void addExistingNumbers(ExistingNumbers existingNumbers) {
        existingNumbersRepository.save(existingNumbers);
    }

    public void updateExistingNumbers(ExistingNumbers existingNumbers) {
        existingNumbersRepository.save(existingNumbers);
    }

    public void deleteExistingNumbers(Integer id) {
        existingNumbersRepository.deleteById(id);
    }
}
