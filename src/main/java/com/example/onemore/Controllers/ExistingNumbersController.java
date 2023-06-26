package com.example.onemore.Controllers;


import com.example.onemore.Repositories.ExistingNumbersRepository;
import com.example.onemore.Services.ExistingNumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.onemore.models.ExistingNumbers;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
@RestController
public class ExistingNumbersController {
    private final ExistingNumbersRepository existingNumbersRepository;
    private final ExistingNumbersService existingNumbersService;

    @Autowired
    public ExistingNumbersController(ExistingNumbersService existingNumbersService, ExistingNumbersRepository existingNumbersRepository) {
        this.existingNumbersService = existingNumbersService;
        this.existingNumbersRepository = existingNumbersRepository;
    }

//    @GetMapping("/please")
//    public String hello(){return "hello world";}

    @GetMapping("/getAllEx")
    public List<ExistingNumbers> getAllExistingNumbers() {
        return existingNumbersService.getAllExistingNumbers();
    }

    @GetMapping("/{id}EN")
    public ExistingNumbers getExistingNumbers(@PathVariable Integer id) {
        return existingNumbersService.getExistingNumbers(id);
    }

    @PostMapping("EN")
    public void createExistingNumbers(@RequestBody ExistingNumbers existingNumbers) {
        existingNumbersService.updateExistingNumbers(existingNumbers);
    }

    @PutMapping("EN")
    public void updateExistingNumbers(@RequestBody ExistingNumbers existingNumbers) {
        existingNumbersService.updateExistingNumbers(existingNumbers);
    }

    @DeleteMapping("/{id}EN")
    public void deleteExistingNumbers(@PathVariable Integer id) {
        existingNumbersService.deleteExistingNumbers(id);
    }

    @GetMapping("/existingNumbers")
    public ModelAndView getAllEN() {
        return new ModelAndView("existingNumbers_list").addObject("en", existingNumbersService.getAllExistingNumbers());
    }
}


